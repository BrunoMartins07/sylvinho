<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Atividade 5</title>
</head>
<body>
    <script>
        var timeA = prompt("Digite o nome do time");
        var timeB = prompt("Digite o nome do time");
        

        var totalDeGols = Number(prompt("Digite o total de gols"));

        for(var i = 0; i <= totalDeGols; i++){
            for(var j = totalDeGols; j >= 0; j--){
                if(i + j== totalDeGols){
                    document.write(timeA  + " " + i + "x" + j + " " +  timeB + "<br>")
                }
                
            }

      }
        


        

        

        

    </script>
</body>
</html>

