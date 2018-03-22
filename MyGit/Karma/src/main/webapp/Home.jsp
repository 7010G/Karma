<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
	<script src="js/jquery.js"></script>
		<script type="text/javascript" src="js/ai.js"></script>
		<script type="text/javascript" src="js/Home.js" ></script>
		<link rel="stylesheet" href="css/ai.css">
		<link rel="stylesheet" href="css/Hone.css" />
</head>
<body>
		<div class="mod-header">
			<div class="cat">
				<div class="cat-box" data-cat="engine">
					<div class="layout">
						<div class="cat-group">
							<h3 class="cat-tit"><div class="cat-ico"><i class="ico-lan"></i></div>自然语言处理</h3>
							<ul class="cat-list">
								<li class="cat-item">
									<div class="cat-item-main">
										<span>基础文本分析</span>
									</div>
									<div class="cat-item-sub">
										<div class="cat-item-row">
											<a href="#participle">分词/词性</a>
											<a href="#proper">专有名词</a>
											<a href="#synonym">同义词</a>
										</div>
									</div>
								</li>
								<li class="cat-item">
									<div class="cat-item-main">
										<span>语义解析</span>
									</div>
									<div class="cat-item-sub">
										<div class="cat-item-row">
											<a href="#">意图/成分<i class="cat-tag is-beta"></i></a>
										</div>
									</div>
								</li>
								<li class="cat-item">
									<div class="cat-item-main">
										<a href="#">情感分析</a>
									</div>
								</li>
								<li class="cat-item">
									<div class="cat-item-main">
										<span>机器翻译</span>
									</div>
									<div class="cat-item-sub">
										<div class="cat-item-row">
											<a href="#">文本翻译</a>
											<a href="#">图片翻译<i class="cat-tag is-new"></i></a>
											<a href="#">语音翻译<i class="cat-tag is-new"></i></a>
										</div>
									</div>
								</li>
								<li class="cat-item">
									<div class="cat-item-main">
										<a href="#">智能闲聊<i class="cat-tag is-hot"></i></a>
									</div>
								</li>
							</ul>
						</div>
						<div class="cat-group">
							<h3 class="cat-tit"><div class="cat-ico"><i class="ico-image"></i></div>计算机视觉</h3>
							<ul class="cat-list">
								<li class="cat-item">
									<div class="cat-item-main">
										<span>OCR<i class="cat-tag is-hot"></i></span>
									</div>
									<div class="cat-item-sub">
										<div class="cat-item-row">
											<a href="#identify">身份证识别</a>
											<a href="#card">名片识别</a>
											<a href="#driverregistration">行驶证/驾驶证识别</a>
										</div>
										<div class="cat-item-row">
											<a href="#businesslicense">营业执照识别</a>
											<a href="#creditcard">银行卡识别</a>
											<a href="#common">通用识别</a>
										</div>
									</div>
								</li>
								<li class="cat-item">
									<div class="cat-item-main">
										<span>人脸识别</span>
									</div>
									<div class="cat-item-sub">
										<div class="cat-item-row">
											<a href="#detect">人脸分析</a>
											<a href="#multiface">多人脸检测<i class="cat-tag is-new"></i></a>
											<a href="#compare">人脸对比</a>
											<a href="#search">人脸搜索</a>
										</div>
										<div class="cat-item-row">
											<a href="#shape">五官定位</a>
											<a href="javascript:void(0);" class="disabled">人脸核身(即将开放)</a>
										</div>
									</div>
								</li>
								<li class="cat-item">
									<div class="cat-item-main">
										<span>图片识别</span>
									</div>
									<div class="cat-item-sub">
										<div class="cat-item-row">
											<a href="#scene">物体/场景识别<i class="cat-tag is-beta"></i></a>
											<a href="#tag">图片标签识别</a>
											<a href="#express">看图说话</a>
										</div>
										<div class="cat-item-row">
											<a href="#fuzzy">模糊图片识别</a>
											<a href="#food">美食图片识别</a>
											<a href="#plants">花草识别<i class="cat-tag is-hot"></i></a>
										</div>
										<div class="cat-item-row">
											<a href="#cars">车辆识别<i class="cat-tag is-new"></i></a>
										</div>
									</div>
								</li>
								<li class="cat-item">
									<div class="cat-item-main">
										<span>图片特效<i class="cat-tag is-new"></i></span>
									</div>
									<div class="cat-item-sub">
										<div class="cat-item-row">
											<a href="#">人脸融合</a>
											<a href="#">滤镜</a>
											<a href="#">人脸美妆</a>
										</div>
										<div class="cat-item-row">
											<a href="#">人脸变妆</a>
											<a href="#">大头贴</a>
											<a href="#">颜龄检测</a>
										</div>
									</div>
								</li>
								<li class="cat-item">
									<div class="cat-item-main">
										<a href="#">智能鉴黄</a>
									</div>
								</li>
								<li class="cat-item">
									<div class="cat-item-main">
										<a href="#">暴恐识别</a>
									</div>
								</li>
							</ul>
						</div>
						<div class="cat-group">
							<h3 class="cat-tit"><div class="cat-ico"><i class="ico-voice"></i></div>智能语音</h3>
							<ul class="cat-list">
								<li class="cat-item">
									<div class="cat-item-main">
										<span>语音识别</span>
									</div>
									<div class="cat-item-sub">
										<div class="cat-item-row">
											<a href="#">语音识别</a>
											<a href="#">长语音识别<i class="cat-tag is-new"></i></a>
											<a href="#">关键词检索<i class="cat-tag is-new"></i></a>
										</div>
									</div>
								</li>
								<li class="cat-item">
									<div class="cat-item-main">
										<a href="#">语音合成<i class="cat-tag is-new"></i></a>
									</div>
								</li>
								<li class="cat-item">
									<div class="cat-item-main">
										<span>语音唤醒(即将开放)</span>
									</div>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>

			<div class="layout clearfix">
				<a href="" class="mod-header-logo">
				<img alt="" src="img/Log.png"> 
					</a>
				<div class="mod-header-nav">
					<ul id="jmod-header-nav">
						<li id="nav-header-serv" class="top-cat hassub" data-cat="engine">
							<h2><a href="javascript:void(0);">技术引擎</a><i class="top-cat-arrow"></i></h2>
						</li>
						<li id="nav-header-accelerator" class="top-cat">
							<h2><a href="#">星球</a></h2></li>
						<li id="nav-header-info" class="top-cat">
							<h2><a href="#">广场</a></h2></li>
						<li id="nav-header-hr" class="top-cat">
							<h2><a href="#">信息</a></h2></li>
						<li id="nav-header-join" class="top-cat">
							<h2><a href="#">自己</a></h2></li>

					</ul>
					<i class="jmod-nav-slider slider hidden" style="transform: translateX(0px);"></i>
				</div>

				<div class="mod-header-user">
					<a href="#" target="_blank" class="try jmod-header-try">设置</a>
				</div>
			</div>

		</div>

		<div class="banner jmod_banner">
			<div class="ban cur" style="background-color:#1e1f21;background-image:url();height: 62px;">
			</div>
		</div>

		</div>
        <!--这里是导航栏下拉列表数据-->
		<script src="js/ai.js">
			
		</script>
	<!--  聊天窗体引入 -->
	<div id="QQ" >
		<iframe id="div01" src="WebSocketChat.jsp" width="100%" height="750px" scrolling="no" frameborder="0"></iframe>
	</div>
		<div id="advert">

			<div class="bg1">
				<div>
					<img src="icons/icon-01.png" alt="" class="icon01">
					<img src="icons/icon-02.png" alt="" class="icon02">
					<img src="icons/icon-03.png" alt="" class="icon03">
					<img src="icons/icon-04.png" alt="" class="icon04">
					<img src="icons/icon-05.png" alt="" class="icon05">
					<img src="icons/icon-06.png" alt="" class="icon06">
					<img src="icons/icon-07.png" alt="" class="icon07">
				</div>
			</div>

			<div class="bg2">
				<div>
					<span class="icon08">
				<img src="icons/icon-08.png" alt="" width="10px">
			</span>
					<span class="icon09">
				<img src="icons/icon-09.png" alt="" width="30px">
			</span>
					<span class="icon10">
				<img src="icons/icon-10.png" alt="" width="20px">
			</span>
				</div>
			</div>
			<div class="bg3">
				<div>
					<span class="icon11">
				<img src="icons/icon-11.png" alt="" width="26px">
			</span>
					<span class="icon12">
				<img src="icons/icon-12.png" alt="" width="18px">
			</span>
				</div>
			</div>

		</div>
	
		<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';">
			版权标识
		</div>

	</body>
</html>