+-------------------------------------+                                                                  
|   ReprodutorMusical                 |                                                                  +---------------------------+                     
+-------------------------------------+                                                                  |        Iphone             |                                
| + tocarMusica(musica: String): void |    +-----------------------------+                               +---------------------------+
| + pausarMusica(): void              |    |        iPhone               |                               |  + ReprodutorMusical      |
| + selecionarMusica(musica: String): |    +-----------------------------+                               |  + AparelhoTelefonico     |       
|    void                             |    | + AparelhoTelefonico        |                               |  + NavegadorInternet      |
| + pararMusica(): void               |<---| + NavegadorInternet         |                               |  + DispositivoEletronico  |
+-------------------------------------+    | + DispositivoEletronico     |                               +---------------------------+
                                           +-----------------------------+                                             ^
       |                                          ^   ^                                                                |       
       |                                          |   |                                                                |
       v                                          |   |                                                    +---------------------------+
+-------------------------+                       |   |                                                    |         Smartphone        |
|   AparelhoTelefonico     <|----------------------   |                                                    +---------------------------+
+-------------------------+                       |                                                        *                           *
| + fazerchamada(numero: String): void    |                                                                |                           |
| + atenderChamada(numero: String): void  |                                                                |                           |
| + iniciarConversaVoz(numero: String):   |                                                                +---------------------------+
|      void                               |            
| + enviarMensagem (numero: String,       |
|       mensagem: String): void           |
| + receberMensagem (numero: String,      |
|       mensagem: String): void           |      
+----------------------------------------+ 
      | 
      |
      |
      v                              
+----------------------+
|   NavegadorInternet   |
+----------------------+           
| + exibirPagina(url: String): void|
| + adicionarNovaAba(url: String): |
|   void                           |   
| + atualizarPagina(): void        |
| + fecharPaginaWeb(): void        |
| + navegarHistorico():void        |
+----------------------------------+       
       |                         
       |
       v
+---------------------------+
|   DispositivoEletronico   |
+---------------------------+
| + ligar(): void           |
| + desligar(): void        |
+---------------------------+       



