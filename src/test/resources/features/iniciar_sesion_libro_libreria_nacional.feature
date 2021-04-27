#language:es
  #Author: armandovallejo@gmail.com

Característica: Casos de pruebas Libreria Nacional
  Como usuerio de la libreria nacional
  quiero ingresar con mi usuario y clave
  para hacer un compra


  Escenario:
    Dado que quiero hacer una compra a la Libreria Nacional
    Cuando ingreso mi usuario y clave
      | usuario                  | clave        |
      | mcwx6369@vlrt7077.tbl.vm | oAegkIIWEQyj |
    Entonces ingrese a la aplicacion
    Y Busco Libros sobre el tema "Terror"