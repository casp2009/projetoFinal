# ProjetoFinal
Projeto final de SOA

Os arquivos SQL contem os dados para popular o MYSQL:

insertLocadorasVeiculos.sql
cidades-brasileiras-ibge.sql

A versão do MYSQl utilizada é a 8.0 para Windows 64x.


# Os endpoint foram projetados da seguinte forma:
# OBS
  as váriaveis serão representadas por palavras entre chaves: {variavel}
  
# Consultar veículo por cidade, modelo e faixa de preço

  <endereço do servidor>:<porta>/veiculo/buscaCidadeModeloFaixapreco/{Codigo da cidade}/{Modelo do Carro}/{Preço inicial}:{Preço Final}
  Codigo da cidade : Integer
  Modelo do carro: String
  Preço Inicial/Final: Double
  
# Consultar veículo por cidade, faixa de preço, ar condicional e tipo de câmbio

    <endereço do servidor>:<porta>/veiculo/buscaCidadeFaixaPrecoArCambio/{Codigo da cidade}/{Preço inicial}:{Preço Final}/{Se tem arcondicionado}/{Tipo de cambio}
    Codigo da cidade : Integer
    Preço Inicial/Final: Double
    Se tem arcondicionado: String (sim/não)
    Tipo de cambio: String (manual/automatico)

# Consultar veículo por cidade, faixa de preço, ar condicional, tipo de câmbio e combustível
      
      <endereço do servidor>:<porta>/veiculo/buscaCidadeFaixaPrecoArCambioCombustivel/{Codigo da cidade}/{Preço inicial}:{Preço Final}/{Se tem arcondicionado}/{Tipo de cambio}/{tipo de combustivel}
    Codigo da cidade : Integer
    Preço Inicial/Final: Double
    Se tem arcondicionado: String (sim/não)
    Tipo de cambio: String (manual/automatico)
    tipo de combustivel: String (fasolina/flex)

# Cadastrar reserva de veículo
        
        <endereço do servidor>:<porta>/reservar/incluir
          
         passar via POST os parametros em formato JSON:
          
        {
          "id": Int,
          "nome": "",
          "locadora": [],
          "veiculo": [],
          "cpf": ""
        }
        

# Alterar reserva de veículo
          
          basta utilizar o metodo buscar ( <endereço do servidor>:<porta>/reservar/buscar/{id da reserva} ) fazer as alterações dos dados e utilizar o <endereço do servidor>:<porta>/reservar/incluir para fazer a alteração.

# Excluir reserva de veículo
          
          informar a ID da reserva na seguinte URL: <endereço do servidor>:<porta>/reservar/deletar/{id da reserva}
