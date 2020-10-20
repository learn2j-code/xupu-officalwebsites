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
	<title>叙谱文化—百家姓_姓氏源流_寻根问祖</title>
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
			<li class="li active"><a href="news">姓氏文化</a></li>
			<!-- <li class="li"><a href="http://pcxunzu.100tp.cn" target="_blank">寻根问祖</a></li> -->
			<li class="li"><a href="http://www.100citang.cn" target="_blank">家族祠堂</a></li>
			<li class="li"><a href="about">关于叙谱</a></li>
			<li class="li"><a href="clanBookShow">族谱展示</a></li>
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
		  <li class="js-breadcrumb">姓氏文化</li>
		</ol>
		<div class="xupu-surnames-wrap mt25 text-center">
			<ul class="xupu-suranme-infor clearfix js-surname-infor">
				<li class="active" data-id="2"><a href="javascript:void(0);">姓氏资讯</a></li>
				<li data-id="3"><a href="javascript:void(0)">寻祖资讯</a></li>
			</ul>
			<div class="mt15 js-infor-wrap">
				<div class="xupu-surname-infor-list-wrap">
					<ul class="xupu-surname-infor-list js-surname-list">
						
					</ul>
				</div>
				<div class="xupu-surname-infor-list-wrap">
					<ul class="xupu-surname-infor-list js-surname-list">
						
					</ul>
				</div>
			</div>
			<ul class="pagination" id="pagination"></ul>
		</div>
	</main>
	
	<%@ include file="public/footer.jsp"%>
	<script type="text/javascript" src="js/public/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="js/public/swiper-4.1.6.min.js"></script>
	<script type="text/javascript" src="js/public/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/public/bootstrap-paginator.js"></script>
	<script src="js/public/calendar-converter.js"></script>
	<script type="text/javascript" src="js/public/common.js"></script>
	<script type="text/javascript" src="js/information.js"></script>
</body>
</html>