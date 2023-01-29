
public class Cliente {
  private String name;
  private String cpf;
  private String profession;

  public Cliente(String name, String cpf) {
    this.name = name;
    this.cpf = cpf;
  }

  public String getName() {
    return name;
  }

  public String getCpf() {
    return cpf;
  }

  public String getProfession() {
    return profession;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setProfession(String profession) {
    this.profession = profession;
  }
}
