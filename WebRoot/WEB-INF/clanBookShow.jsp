<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
	<base href="<%=basePath%>">
	<link rel="shortcut icon" href="favicon.ico">
	<title>叙谱</title>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/font-awesome.css">
	<link rel="stylesheet" type="text/css" href="css/swiper.min.css">
	<link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
	<%@ include file="public/header.jsp"%>
	<nav>
		<ul class="container xupu-nav-items">
			<li class="li"><a href="/">首页</a></li>
			<li class="li"><a href="news">姓氏文化</a></li>
			<!-- <li class="li"><a href="http://pcxunzu.100tp.cn" target="_blank">寻根问祖</a></li> -->
			<li class="li"><a href="http://www.100citang.cn" target="_blank">家族祠堂</a></li>
			<li class="li"><a href="about">关于叙谱</a></li>
			<li class="li active""><a href="clanBookShow.html">族谱展示</a></li>
		</ul>
	</nav>
	<main class="container">
		<div class="xupu-banner-wrap mt15 swiper-container">
			<ul class="xupu-banner swiper-wrapper">
				<li class="swiper-slide"><img src="images/banner1.png" alt='刘强东寻祖'></li>
				<li class="swiper-slide"><img src="images/banner2.png" alt='百里挑一，家谱传承'></li>
				<li class="swiper-slide"><img src="images/banner3.png" alt='祠堂功德碑'></li>
				<li class="swiper-slide"><a href="http://www.100citang.cn" target="_blank"><img src="images/banner4.png" alt='宗祠万里，千年传承' style="height: 100%;"></a></li>
			</ul>
			<div class="swiper-pagination family-pagination"></div>
		</div>
		<ol class="breadcrumb mt15">
		  <li><a href="/">首页</a></li>
		  <li>族谱展示</li>
		</ol>
		<div class="xupu-surnames-wrap mt25">
			<div class="flex flex-wrap">
				<div class="clearflex">
					<div class="xupu-clan-book-list" data-id="2">
						<p><img src="images/clanBookCover.png"></p>
						<span>浏北欧阳五修谱</span>
					</div>
				</div>
				<div class="clearflex">
					<div class="xupu-clan-book-list" data-id="7">
						<p><img src="images/clanBookCover.png"></p>
						<span>油井刘氏族谱</span>
					</div>
				</div>
				<div class="clearflex">
					<div class="xupu-clan-book-list">
						<p><img src="images/clanBookCover.png"></p>
						<span>兰溪俞氏五修谱</span>
					</div>
				</div> 
				<div class="clearflex">
					<div class="xupu-clan-book-list">
						<p><img src="images/clanBookCover.png"></p>
						<span>大词张氏族谱</span>
					</div>
				</div>
				<div class="clearflex">
					<div class="xupu-clan-book-list">
						<p><img src="images/clanBookCover.png"></p>
						<span>尚梅王氏族谱</span>
					</div>
				</div>
				<div class="clearflex">
					<div class="xupu-clan-book-list">
						<p><img src="images/clanBookCover.png"></p>
						<span>曹氏三修族谱</span>
					</div>
				</div> 
				<div class="clearflex">
					<div class="xupu-clan-book-list">
						<p><img src="images/clanBookCover.png"></p>
						<span>上海王氏族谱</span>
					</div>
				</div>
				<div class="clearflex">
					<div class="xupu-clan-book-list">
						<p><img src="images/clanBookCover.png"></p>
						<span>达池张氏族谱</span>
					</div>
				</div>
				<div class="clearflex">
					<div class="xupu-clan-book-list">
						<p><img src="images/clanBookCover.png"></p>
						<span>梁氏族谱</span>
					</div>
				</div> 
				<div class="clearflex">
					<div class="xupu-clan-book-list">
						<p><img src="images/clanBookCover.png"></p>
						<span>福禄曾氏族谱</span>
					</div>
				</div>
				<div class="clearflex">
					<div class="xupu-clan-book-list">
						<p><img src="images/clanBookCover.png"></p>
						<span>下达元氏族谱</span>
					</div>
				</div>
				<div class="clearflex">
					<div class="xupu-clan-book-list">
						<p><img src="images/clanBookCover.png"></p>
						<span>明氏族谱</span>
					</div>
				</div> 
				<div class="clearflex">
					<div class="xupu-clan-book-list">
						<p><img src="images/clanBookCover.png"></p>
						<span>沥阳余氏族谱</span>
					</div>
				</div>
				<div class="clearflex">
					<div class="xupu-clan-book-list">
						<p><img src="images/clanBookCover.png"></p>
						<span>周氏族谱</span>
					</div>
				</div>
			</div>
		</div>
	</main>
	<div class="modal fade" id="loginClanBook" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">查看族谱</h4>
	      </div>
	      <div class="modal-body">
	        <div class="form-horizontal mt15">
	        	<input type="hidden" value="" id="clanBookId">
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label label-gray-color">用户名</label>
					<div class="col-sm-9">
						<input type="text" name="" class="form-control js-prefectureLocations" placeholder="请输入用户名" maxlength="50" id="userName">
					</div>
				</div>
		
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label label-gray-color">密码</label>
					<div class="col-sm-9">
						<input type="password" name="" class="form-control js-prefectureLocations" placeholder="请输入密码" maxlength="50" id="passWord">
					</div>
				</div>
		 </div>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary" id="loginBtn">登录</button>
	      </div>
	    </div>
	  </div>
	</div>
	<%@ include file="public/footer.jsp"%>
	<script type="text/javascript" src="js/public/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="js/public/swiper-4.1.6.min.js"></script>
	<script type="text/javascript" src="js/public/bootstrap.min.js"></script>
	<script src="js/public/calendar-converter.js"></script>
	<script type="text/javascript" src="js/public/common.js"></script>
	<script type="text/javascript" src="js/clanBookShow.js"></script>
</body>
</html>