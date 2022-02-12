<!DOCTYPE html>
<html>
<head>
<title>${status} ${error}</title>
    <style>
        body {
            background-image: url(/img/error/404.png);
            background-size: 100% ;
            background-repead:no-repead;
        }
        div {
            width: 80%;
            height: 20%;
            margin: 12vh auto auto;
            display: block;
            font-size: 5rem;
            font-weight: bold;
            text-align: center;
            color: darkcyan;
        }
    </style>
</head>
<body>
<div>${status} ${error}</div>
</body>
</html>