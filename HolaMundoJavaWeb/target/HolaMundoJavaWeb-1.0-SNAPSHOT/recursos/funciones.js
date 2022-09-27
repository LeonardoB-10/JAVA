function validarForma(forma) {
  let nombre = forma.nombre;
  let apellido = forma.apellido;
  let telefono = forma.telefono;
  let correo = forma.correo;
  let contrasena = forma.contrasena;
  
  if(contrasena.value.length < 6) {
    alert("La contraseña debe tener al menos 6 caracteres");
    contrasena.focus();
    contrasena.select();
  }

  alert("Formulario valido, enviando datos al servidor");
  return true;
  
}
