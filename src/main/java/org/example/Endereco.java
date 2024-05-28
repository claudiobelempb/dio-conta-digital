package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Endereco {
  private String endereco;
  private String bairro;
  private String cidade;
  private String uf;
}
