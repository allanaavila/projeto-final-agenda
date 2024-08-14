public void removerContato(String telefone) {
    Contato contato = buscarContatoPorTelefone(telefone);
    if (contato != null) {
        contatos.remove(contato);
        System.out.println("Contato removido com sucesso!");
    } else {
        System.out.println("Contato não encontrado.");
    }
}
