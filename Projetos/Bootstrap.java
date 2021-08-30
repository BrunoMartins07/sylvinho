<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
     integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bootstrap</title>
</head>

<body>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <h3 class="text-primary text-center">
                    AULA TABELAS ALTERNATIVAS
                </h3>
                <div class="row">
                    <div class="col-md-8">
                        <ul class="nav">
                            <li class="nav-item">
                                <a class="nav-link active" href="file:///C:/Users/SESI_SENAI/Downloads/bootstrap.html">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="file:///C:/Users/SESI_SENAI/Downloads/aaaaaaaaaaaaaaa.html">Profile</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link disabled" href="#">Messages</a>
                            </li>
                            <li class="nav-item dropdown ml-md-auto">
                                 <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown">Dropdown link</a>
                                <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                                     <a class="dropdown-item" href="#">Action</a> <a class="dropdown-item" href="#">Another action</a> <a class="dropdown-item" href="#">Something else here</a>
                                    <div class="dropdown-divider">
                                    </div> <a class="dropdown-item" href="#">Separated link</a>
                                </div>
                            </li>
                        </ul>
                        <table class="table" id="tabela">
                            <thead>
                                <tr>
                                    <th>
                                        Codigo
                                    </th>
                                    <th>
                                        Nome
                                    
                                </tr>
                            </thead>
                            <tbody>
                                
                            </tbody>
                        </table>
                    </div>
                    <div class="col-md-4">
                        <p>
                            Exercício Tabela!
                        </p>
                        <p>
                            <a class="btn" href="#"></a>
                        </p> 
                        <input type="text" id="nome">
                        <button onclick="palavra()" type="button" class="btn btn-lg btn-danger btn-success active">
                            Adicionar
                        </button>
                        <script>
                            
                            var cod = 0;
                            function palavra(){
                                
                                cod ++;
                                var botaoRemove = "<td><button onclick='removeTR(this)'>DELETA</button></td>";
                                var a = document.getElementById("nome").value;
                                var linha = "<tr><td>"+cod+"</td><td>"+a+"</td>" + botaoRemove;
                                document.getElementById("tabela").innerHTML += linha;
                                document.getElementById("tabela").innerHTML += "</tr>";
                                document.getElementById("nome").value = null;


                            }
                            function removeTR(id){
                                var linha = id.parentNode.parentNode.rowIndex;
                                document.getElementById('tabela').deleteRow(linha);
                            }
                            
                         
                        </script>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

</html>
