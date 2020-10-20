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
	<meta name="keywords" content="${article.keyword}">
	<meta name="description" content="${article.articalAbstract}">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/font-awesome.css">
	<link rel="stylesheet" type="text/css" href="css/swiper.min.css">
	<link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
	<header>
		<div class="container">
			<div class="xupu-logo pull-left">
				
			</div>
			<div class="pull-left xupu-logo-title">弘扬中华姓氏文化,传承千年家族遗风</div>
			<div class="xupu-logo-right pull-right">
				<div class="xupu-login-btn-group pull-right">
					<a href="javascript:void(0);">登录</a>
					<a href="javascript:void(0);">注册</a>
				</div>
				<div class="xupu-date pull-right flex">
					<div class="clearflex"><i class="fa fa-calendar"></i></div>
					<div>
						<div class="f12 js-current-date"></div>
						<div class="js-current-old-date"></div>
					</div>
				</div>
			</div>
		</div>
	</header>
	<nav>
		<ul class="container xupu-nav-items">
			<li class="li"><a href="/">首页</a></li>
			<li class="li active"><a href="baijiaxing">百家姓</a></li>
			<li class="li"><a href="news">姓氏文化</a></li>
			<li class="li"><a href="http://pcxunzu.100tp.cn" target="_blank">寻根问祖</a></li>
			<li class="li"><a href="http://www.100citang.cn" target="_blank">家族祠堂</a></li>
			<li class="li"><a href="about">关于叙谱</a></li>
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
		  <li><a href="baijiaxing">百家姓</a></li>
		  <li>姓氏详情</li>
		</ol>
		<div class="xupu-surnames-wrap mt25">
			<div class="row mhn">
				<div class="col-lg-8 col-md-8 col-sm-6 col-xs-12 phn">
					<h3 class="xupu-surname-title js-surname-title"></h3>
					<div class="xupu-surname-intro">
						<span>时间:<font class="js-article-time">2018-3-21</font></span>
						<span>来源:<font>电子家谱</font></span>
						<span>作者:<font>叙谱官网</font></span>
					</div>
					<div class="xupu-surname-content"><!--  js-article-content -->
						${article.content}
						<!-- <img src="images/1.png">
						<p class="mt15">湖南叙谱文化传播有限公司以家族传统文化为基点，构建O2O家族（庭）社区互联网平台，助千万人寻根，扶上亿家庭建档。</p>

 <p>叙谱文化秉承“亲情、合作、传承”的企业理念，追宗溯祖，收拢宗族，凝聚人心，建数万宗亲会，联十万媒体人，写百万家庭史。</p>

 <p>叙谱文化以华人华侨（族谱）大数据为企业基石，为全球华人提供数字化、结构化的族谱编修（纸谱电子谱同修）、家史传记策划写作、家文化（宗亲）产品订制、家文化图书出版发行及宗亲组织协助建设与咨询等多样化服务，以寻根留本，清缘备查，增知育人，血肉联情，承前启后，共建华人亲情圈。</p>
	
 <p>修一幅家堂画，奉先思孝，悬挂供奉，叙谱文化致力于家文化，致力于世系传承，敬宗收族，致力于成为全球最大的家文化解决方案提供商。
</p> -->
					</div>
					<!-- <ul class="xupu-contact mt45 xupu-article-icon">
						<li><i class="fa fa-weixin"></i></li>
						<li><i class="fa fa-qq"></i></li>
						<li><i class="fa fa-weibo"></i></li>
					</ul> -->
					<!-- JiaThis Button BEGIN -->
					<!-- <ul class="xupu-contact mt45 xupu-article-icon">
						<li><a class="jiathis_button_weixin"><i class="fa fa-weixin"></i></a></li>
						<li><a class="jiathis_button_qzone"><i class="fa fa-qq"></i></a></li>
						<li><a class="jiathis_button_tsina"><i class="fa fa-weibo"></i></a></li>
					</ul> -->
					<div class="bdsharebuttonbox">
					<!-- <a href="#" class="bds_more" data-cmd="more"></a> -->
					<a href="#" class="bds_qzone" data-cmd="qzone"></a>
					<a href="#" class="bds_tsina" data-cmd="tsina"></a>
					<!-- <a href="#" class="bds_tqq" data-cmd="tqq"></a> -->
					<!-- <a href="#" class="bds_renren" data-cmd="renren"></a> -->
					<a href="#" class="bds_weixin" data-cmd="weixin"></a>
					</div>
<script>window._bd_share_config={"common":{"bdSnsKey":{},"bdText":"","bdMini":"2","bdPic":"","bdStyle":"0","bdSize":"16"},"share":{},"image":{"viewList":["qzone","tsina","tqq","renren","weixin"],"viewText":"分享到：","viewSize":"16"},"selectShare":{"bdContainerClass":null,"bdSelectMiniList":["qzone","tsina","tqq","renren","weixin"]}};with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src='http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+~(-new Date()/36e5)];</script>
					
					<span class="xupu-article-share-text">快去分享吧!</span>
					<div class="xupu-surname-intro pull-right">
						<span>来源:<font></font>电子家谱</span>
						<span>作者:<font></font>叙谱官网</span>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 phn text-center">
					<div class="xupu-right-article">
						<h5 class="xupu-title">姓氏资讯<a href='news?moduleType=1&id=6' class="pull-right">更多</a></h5>
						<ul class="js-surname-infor-list">
							
						</ul>
					</div>
					<div class="xupu-right-article mt15">
						<h5 class="xupu-title">寻祖资讯<a href='news?moduleType=2&id=6' class="pull-right">更多</a></h5>
						<ul class="js-xuzu-infor-list">
						</ul>
					</div>
				</div>
			</div>
		</div>
	</main>
	<footer class="mt45">
		<div class="container clearfix">
			<div class="xupu-frient-link-wrap clearfix">
				<h5 class="xupu-title">友情链接</h5>
				<ul class="xupu-friend-link clearfix js-friend-link">
					
				</ul>
			</div>
			
			<div class="flex">
				<div class="xupu-crop-info">
					<span>
						地址: 湖南省长沙岳麓区江岸景苑B座412室
					</span>
					<span>
						Copyright © 2017 湖南叙谱文化传播有限公司版权所有
					</span>
				</div>
				<div>
					<h5  class="xupu-title mt25">联系我们</h5>
					<ul class="xupu-contact mt15">
						<li><i class="fa fa-phone"></i>
							<div class="phone">
								<p><i class="fa fa-phone"></i>&ensp;15273121398</p>
							</div>
						</li>
						<li>
							<i class="fa fa-weixin"></i>
							<div class="weixin">
								<img src="images/weixin.png">
							</div>
						</li>
						<li>      <i class="fa fa-qq"></i>
							<div class="qq">
								<img src="images/qq.png">
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div class="text-center xupu-footer-title">叙谱文化以中华<a href="http://www.xupu168.com/officalwebsites/surnames">姓氏文化</a>为基点,助千万人<a href="http://pcxunzu.100tp.cn">寻祖</a></div>
		<script>
			(function(){
    		var bp = document.createElement('script');
    		bp.src = "http://push.zhanzhang.baidu.com/push.js";
    		var s = document.getElementsByTagName("script")[0];
    		s.parentNode.insertBefore(bp, s);
			})();
		</script>
	</footer>
	<script type="text/javascript" src="js/public/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="js/public/swiper-4.1.6.min.js"></script>
	<script src="js/public/calendar-converter.js"></script>
	<script type="text/javascript" src="js/public/common.js"></script>
	<script type="text/javascript" src="http://v3.jiathis.com/code/jia.js" charset="utf-8"></script>
	<script type="text/javascript" src="js/articleDetail.js"></script>
</body>
</html>