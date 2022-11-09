package jp.co.trainocamp.demo.mybatis.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.trainocamp.demo.mybatis.entity.Article;
import jp.co.trainocamp.demo.mybatis.entity.Comment;
import jp.co.trainocamp.demo.mybatis.form.ArticleForm;
import jp.co.trainocamp.demo.mybatis.form.CommentForm;
import jp.co.trainocamp.demo.mybatis.mapper.ArticleMapper;
import jp.co.trainocamp.demo.mybatis.mapper.CommentMapper;

@Controller
public class ArticleController {
	@Autowired
	private ArticleMapper articleMapper;
	
	@Autowired
	private CommentMapper commentMapper;
	
	@ModelAttribute
	private ArticleForm setUpForm() {
		return new ArticleForm();
	}
	
	@ModelAttribute
	private CommentForm setUpComForm() {
		return new CommentForm();
	}
	
	@GetMapping("/index")
	public String index(Model model) {
		
		List<Article> articleList =articleMapper.selectAll();
		
		articleList.forEach(article -> {
			List<Comment> commentList = commentMapper.findByArticleId(article.getId());
			article.setCommentList(commentList);
		});
		
		model.addAttribute("articles", articleList);
		
		
		return "article-comment";
	}
	
	@PostMapping("/result")
	public String result(ArticleForm form) {
		Article article = new Article();
		BeanUtils.copyProperties(form, article);
		articleMapper.insert(article);
		return "redirect:/index";
	}
	
	@PostMapping("/commentresult")
	public String commentresult(CommentForm form, Integer id) {
		Comment comment = new Comment();
		BeanUtils.copyProperties(form, comment);
		comment.setArticleId(id);
		commentMapper.insert(comment);
		return "redirect:/index";
	}
	
	@PostMapping("/delete")
	public String delete(Integer id) {
		commentMapper.deleteByArticleId(id);
		articleMapper.deleteById(id);
		return "redirect:/index";
	}
	
}
