# Funcionalidades iPhone - Desafio POO

O objetivo do desafio é modelar e diagramar a representação do iPhone com base no [vídeo de lançamento do dispositivo](https://www.youtube.com/watch?v=9ou608QQRq8).

## Diagrama de classes
```plantuml
@startuml
class Iphone
interface ReprodutorMusical {
  + void tocar()
  + void pausar()
  + void selecionarMusica(String musica)
}
interface AparelhoTelefonico {
  + void ligar(String numero)
  + void atender()
  + void iniciarCorreioVoz()
}
interface NavegadorInternet {
  + void exibirPagina(String url)
  + void adicionarNovaAba()
  + void atualizarPagina()
}

ReprodutorMusical <|-- Iphone
AparelhoTelefonico <|-- Iphone
NavegadorInternet <|-- Iphone
@enduml
```