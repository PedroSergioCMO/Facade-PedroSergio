public class VendaPacoteViagemFacade {
  private SistemaPagamento sistemaPagamento;
  private SistemaReservaPassagem sistemaReservaPassagem;
  private SistemaReservaHotel sistemaReservaHotel;
  private SistemaAluguelCarro sistemaAluguelCarro;

  public VendaPacoteViagemFacade() {
    this.sistemaPagamento = new SistemaPagamento();
    this.sistemaReservaPassagem = new SistemaReservaPassagem();
    this.sistemaReservaHotel = new SistemaReservaHotel();
    this.sistemaAluguelCarro = new SistemaAluguelCarro();
  }

  public void venderPacoteViagem(String destino, String dataPartida, String dataRetorno, String tipoQuarto, String tipoCarro) {
    double preco = calcularPreco(destino, dataPartida, dataRetorno, tipoQuarto, tipoCarro);
    sistemaPagamento.processarPagamento(preco);
    sistemaReservaPassagem.reservarPassagem(destino, dataPartida, dataRetorno);
    sistemaReservaHotel.reservarHotel(destino, dataPartida, dataRetorno, tipoQuarto);
    sistemaAluguelCarro.alugarCarro(destino, dataPartida, dataRetorno, tipoCarro);
    System.out.println("Pacote de viagem para " + destino + " vendido com sucesso!");
  }

  private double calcularPreco(String destino, String dataPartida, String dataRetorno, String tipoQuarto, String tipoCarro) {
    // Lógica de cálculo de preço aqui
    return 2341.0;
  }
}

class SistemaPagamento {
  public void processarPagamento(double preco) {
    System.out.println("Processando pagamento de R$" + preco + "...");
    // Lógica de processamento de pagamento aqui
    System.out.println("Pagamento de R$" + preco + " processado com sucesso!");
  }
}

class SistemaReservaPassagem {
  public void reservarPassagem(String destino, String dataPartida, String dataRetorno) {
    System.out.println("Reservando passagem para " + destino + "...");
    // Lógica de reserva de passagem aqui
    System.out.println("Passagem para " + destino + " reservada com sucesso!");
  }
}

class SistemaReservaHotel {
  public void reservarHotel(String destino, String dataPartida, String dataRetorno, String tipoQuarto) {
    System.out.println("Reservando hotel em " + destino + "...");
    // Lógica de reserva de hotel aqui
    System.out.println("Hotel em " + destino + " reservado com sucesso!");
  }
}

class SistemaAluguelCarro {
  public void alugarCarro(String destino, String dataPartida, String dataRetorno, String tipoCarro) {
    System.out.println("Alugando carro em " + destino + "...");
    // Lógica de aluguel de carro aqui
    System.out.println("Carro em " + destino + " alugado com sucesso!");
  }
}
