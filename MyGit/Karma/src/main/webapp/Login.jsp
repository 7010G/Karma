<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
		<meta charset="UTF-8">
		<title></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<script src="js/jquery.js"></script>
		<script src="js/loginplaceholder.js"></script>
		<style>
			@import url("https://fonts.googleapis.com/css?family=Montserrat:200,300,400,600");
			.more-pens {
				position: fixed;
				left: 20px;
				bottom: 20px;
				z-index: 10;
				font-family: "Montserrat";
				font-size: 12px;
			}
			
			a.white-mode,
			a.white-mode:link,
			a.white-mode:visited,
			a.white-mode:active {
				font-family: "Montserrat";
				font-size: 12px;
				text-decoration: none;
				background: #212121;
				padding: 4px 8px;
				color: #f7f7f7;
			}
			
			a.white-mode:hover,
			a.white-mode:link:hover,
			a.white-mode:visited:hover,
			a.white-mode:active:hover {
				background: #edf3f8;
				color: #212121;
			}
			
			body {
				margin: 0;
				padding: 0;
				overflow: hidden;
				width: 100%;
				height: 100%;
				background: #000000;
			}
			
			.title {
				z-index: 10;
				position: absolute;
				left: 50%;
				top: 50%;
				transform: translateX(-50%) translateY(-50%);
				font-family: "Montserrat";
				text-align: center;
				width: 100%;
			}
			
			.title h1 {
				position: relative;
				color: #EEEEEE;
				font-weight: 600;
				font-size: 60px;
				padding: 0;
				margin: 0;
				line-height: 1;
				text-shadow: 0 0 30px #000155;
			}
			
			.title h1 span {
				font-weight: 600;
				padding: 0;
				margin: 0;
				color: #BBB;
			}
			
			.title h3 {
				font-weight: 200;
				font-size: 20px;
				padding: 0;
				margin: 0;
				line-height: 1;
				color: #EEEEEE;
				letter-spacing: 2px;
				text-shadow: 0 0 30px #000155;
			}
			
			.form_win>div.form_title span {
				color: #FFFFFF;
				font-size: 18px;
				text-align: center;
				line-height: 80px;
				display: block;
			}
			
			.form_win .submit {
				width: 8%;
				height: 40px;
				margin: auto;
				text-align: center;
				line-height: 35px;
				color: #FFFFFF;
				background: #66D354;
				font-size: 18px;
				border: 0;
				outline: none;
				border-radius: 5px;
				-webkit-appearance: none;
				cursor: pointer;
				display: block;
				-webkit-tap-highlight-color: rgba(0, 0, 0, 0);
			}
			
			.form_win>div.login_copy {
				width: 100%;
				line-height: 25px;
				text-align: center;
				margin-top: 35px;
				border: 0;
				background: none;
			}
			
			.form_win>div.login_copy a {
				color: #fff;
				text-decoration: none;
				font-size: 14px;
			}
			
			.form_win {
				width: 100%;
				/*height: 400px;
				/*background-color:#FFFFFF;*/
				border-radius: 0px;
				/*box-shadow: 0 0 5px 2px rgba(0,0,0,.1);*/
				/*border: 1px solid red;*/
			}
			
			.form_win>div {
				width: 20%;
				height: 50px;
				margin: auto;
				/*border: 1px solid #DCDCDC;*/
				border-radius: 5px;
				position: relative;
				background: #FFFFFF;
			}
			
			.form_win>div.user i {
				background: url(img/user.png) no-repeat center center;
				background-size: 50%;
			}
			
			.form_win>div.user {
				margin-top: 20px;
				border-radius: 5px 5px 0 0;
				border-bottom: 0;
				-moz-box-shadow: 0px 2px 5px #c5c5c5 inset;
				/* For Firefox3.6+ */
				-webkit-box-shadow: 0px 2px 5px #c5c5c5 inset;
				/* For Chrome5+, Safari5+ */
				box-shadow: 0px 2px 5px #c5c5c5 inset;
				/* For Latest Opera */
				border-bottom: 1px solid #C5C5C5;
			}
			
			.form_win>div.passerword {
				border-radius: 0 0 5px 5px;
			}
			.form_win>div.passerword i {
				background: url(img/password.png) no-repeat center center;
				background-size: 50%;
			}
			
			.form_win>div input::-moz-placeholder {
				color: #EEEEEE;
			}
			
			.form_win>div input {
				width: 80%;
				height: 25px;
				margin-top: 15px;
				font-size: 12px;
				padding: 0 10px 0 10px;
				line-height: 25px;
				outline: none;
				border: 0;
				background: transparent;
				-webkit-tap-highlight-color: rgba(0, 0, 0, 0);
			}
		</style>

	</head>

	<body>

		<div class="title">
			<h3>KARMA.it - 2018</h3>
			<h1>This is a new beginning.</h1>
			<div class="login_win">

				<form action="Loging" method="post" class="form_win">
					<!--<div class="form_title">+
						<span>用户登录</span>
					</div>-->
					<div class="user">
						<i></i><input type="text" name="" id="" placeholder="账号/手机号" />
					</div>
					<div class="passerword">
						<i></i><input type="password" name="" id="" placeholder="密码" />
					</div>
					<div class="login_copy">
						<a href="javascript:;">忘记密码？</a>
					</div>
					<input type="submit" value="登 录" class="submit" />
					<div class="login_copy">
						<a href="main.html" target="_blank">官方网站：http://www.My good luck.com</a>
					</div>
				</form>

			</div>

		</div>

		<script>
			'use strict';

			function _classCallCheck(instance, Constructor) {
				if(!(instance instanceof Constructor)) {
					throw new TypeError("Cannot call a class as a function");
				}
			}

			var max_particles = 1000;

			var tela = document.createElement('canvas');
			tela.width = $(window).width();
			tela.height = $(window).height();
			$("body").append(tela);

			var canvas = tela.getContext('2d');

			var Particle = function() {
				function Particle(canvas, progress) {
					_classCallCheck(this, Particle);

					var random = Math.random();
					this.progress = 0;
					this.canvas = canvas;

					this.x = $(window).width() / 2 + (Math.random() * 200 - Math.random() * 200);
					this.y = $(window).height() / 2 + (Math.random() * 200 - Math.random() * 200);

					this.w = $(window).width();
					this.h = $(window).height();
					this.radius = random > .2 ? Math.random() * 1 : Math.random() * 3;
					this.color = random > .2 ? "#d8002c" : "#F9314C";
					this.radius = random > .8 ? Math.random() * 2 : this.radius;
					this.color = random > .8 ? "#7DFFF2" : this.color;

					// this.color  = random > .1 ? "#ffae00" : "#f0ff00" // Alien
					this.variantx1 = Math.random() * 300;
					this.variantx2 = Math.random() * 400;
					this.varianty1 = Math.random() * 100;
					this.varianty2 = Math.random() * 120;
				}

				Particle.prototype.render = function render() {
					this.canvas.beginPath();
					this.canvas.arc(this.x, this.y, this.radius, 0, 2 * Math.PI);
					this.canvas.lineWidth = 2;
					this.canvas.fillStyle = this.color;
					this.canvas.fill();
					this.canvas.closePath();
				};

				Particle.prototype.move = function move() {
					// this.x += (Math.sin(this.progress/this.variantx1)*Math.cos(this.progress/this.variantx2));
					// this.y += (Math.sin(this.progress/this.varianty1)*Math.cos(this.progress/this.varianty2));
					this.x += Math.sin(this.progress / this.variantx1) * Math.cos(this.progress / this.variantx2);
					this.y += Math.cos(this.progress / this.varianty2);

					if(this.x < 0 || this.x > this.w - this.radius) {
						return false;
					}

					if(this.y < 0 || this.y > this.h - this.radius) {
						return false;
					}
					this.render();
					this.progress++;
					return true;
				};

				return Particle;
			}();

			var particles = [];
			var init_num = popolate(max_particles);

			function popolate(num) {
				for(var i = 0; i < num; i++) {
					setTimeout(function() {
						particles.push(new Particle(canvas, i));
					}.bind(this), i * 20);
				}
				return particles.length;
			}

			function clear() {
				canvas.globalAlpha = 0.05;
				canvas.fillStyle = '#000';
				canvas.fillRect(0, 0, tela.width, tela.height);
				canvas.globalAlpha = 1;
			}

			function update() {
				particles = particles.filter(function(p) {
					return p.move();
				});
				if(particles.length < init_num) {
					popolate(1);
				}
				clear();
				requestAnimationFrame(update.bind(this));
			}
			update();
		</script>

	</body>

</html>