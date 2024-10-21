
<body>
    <h1>API Ejercicio</h1>
    <p>Esta es una API simple que está desplegada en Render. Puedes acceder a ella a través de la siguiente URL:</p>

    URL Base
   
<code>https://api-ejercicio-1-0-0.onrender.com/</code>
   

    Endpoints

    1. Crear Operación
    Endpoint: POST /operation

    Formato del Request:
<code>{
  "amount": 100,
  "card": {
    "number": "1234567890123456",
    "cardholder": "John Doe",
    "expirationDate": "2024-10-05",
    "brand": "Visa"
  }
}</code>
  

    Requisitos:
    
        La tasa debe llamarse Visa, Nara o Amex
        La fecha de expiración debe ser  mayor a la actual.
   
    Response:
    Al enviar una solicitud válida, la API devolverá un response que incluye la información de la marca de la tarjeta y el importe total con las tasas aplicadas.
    Ejemplo de Response:
<code>{
  "brand": "Visa",
  "totalAmount": 110.0
}</code>
</body>

