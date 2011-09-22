<html>

<head>
	<meta name="layout" content="main"/>
	<script type="text/javascript">
		function load() {
			$.get("http://localhost:8080/services-person/api/person/1", function(response) {
				$("#output").append("<p>RECEIVED: " + JSON.stringify(response) + "</p>");
			});
		}

		$(document).ready(function() {
			$("#load").click(load);
		});
	</script>
</head>

<body>
	<h1>${message}</h1>
	<button id="load">Load data</button>
	<div id="output"></div>
</body>

</html>
