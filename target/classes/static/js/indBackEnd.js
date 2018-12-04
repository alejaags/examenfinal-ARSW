var calcularValor = (function(){

    var errorMessage = function () {
        alert("ERROR");
    };

    return {
            getTempVal : async function (callback) {
                await Promise.resolve(axios.get('/Temp/' + document.getElementById('selectMed').value + '/' + document.getElementById('val').value))
                    .then(function (response) {
                        document.getElementById("resp").innerHTML = JSON.stringify(response.data);

                    })
                    .catch(function () {
                        errorMessage();
                    });
            }
        };


})();