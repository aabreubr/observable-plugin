package br.com.plugin;

import org.example.interfaces.Observable;
import org.example.interfaces.UseCase;
import org.springframework.stereotype.Service;

@Service
public class NotificationPlugin implements Observable {

    private UseCase useCase;

    /**
     * Somente para exemplificar, poderia ser uma leitura ao banco de dados
     * **/
    private String valorRecebido;

    @Override
    public void execute(String s) {
        System.out.println("####### Enviando a notificacao para o parceiro: " + s);
        valorRecebido = s;
    }

    @Override
    public void setObservable(UseCase useCase) {
        this.useCase = useCase;
    }

    public void responderProduto() {
        useCase.response(valorRecebido);
    }

}
