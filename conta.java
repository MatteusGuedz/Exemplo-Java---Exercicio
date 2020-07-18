class Conta {
  /// atributos que todo conta tem

  int numero;
  String dono;
  double saldo;
  double limite;

  // método que saca uma determinada quantidade.
  boolean saca(double valor) {
    if (this.saldo < valor) {
      return false;

    } else {
      this.saldo = this.saldo - valor;
      return true;
    }
  }// fim do método saca.

  // método que deposita uma quantia.
  void deposita(double valor) {
    this.saldo += valor; // ou this.saldo = saldo + valor;
    // *soma quantidade ao valor antigo do saldo
    // e guarda no próprio saldo.
  }// fim do método deposita.



  //trasfere 

  boolean transfere(Conta destino, double valor){
    boolean retirou = this.saca (valor);
    if (retirou == false){
      return false;
    }else{
      destino.deposita (valor);
      return true;
    }
  }

  

  
 
}// fim da classe Conta.

class Programa {
  // método principal.
  public static void main(String[] args) {
    // criando a conta
    // variável minha conta do tipo conta.
    Conta minhaConta = new Conta(); // ou pode ser tbm Conta minhaConta = new Conta();
    Conta contaAmigo = new Conta();
   
       
      //alterando os valores de minhaConta.
      minhaConta.dono = "Mateus";
      contaAmigo.dono = "Guedz";
      minhaConta.saldo = 200.3;
      contaAmigo.saldo = 120.5;

      System.out.println("---------------------------------------------------");
      System.out.println(minhaConta.dono + " Saldo atual é: " + minhaConta.saldo);
      System.out.println(contaAmigo.dono + " Saldo atual é: " + contaAmigo.saldo);
      

     //trasfere
     
      minhaConta.transfere(contaAmigo, 20.2);
     
      //verificar saldo atual
      System.out.println("---------------------------------------------------");
      System.out.println(minhaConta.dono + " Ralizou uma transferencia para " + contaAmigo.dono);
      System.out.println(minhaConta.dono + " Saldo atual é: " + minhaConta.saldo);
      System.out.println(contaAmigo.dono + " Saldo atual é: " + contaAmigo.saldo);

       
      //saca quanto quiser 

      contaAmigo.saca(19.5);

      System.out.println("---------------------------------------------------");
      System.out.println(contaAmigo.dono + " realizou saque e agora tem de saldo " +  contaAmigo.saldo );
  
      
       
      //deposita xxx reais
      minhaConta.deposita(10);

      System.out.println("---------------------------------------------------");
      System.out.println(minhaConta.dono + " Saldo atual é: " + minhaConta.saldo);
      System.out.println(contaAmigo.dono + " Saldo atual é: " + contaAmigo.saldo);



               
  }
}