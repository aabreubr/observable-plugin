package br.com.plugin;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerResponse {

    private NotificationPlugin notificationPlugin;

    public ControllerResponse(NotificationPlugin notificationPlugin) {
        this.notificationPlugin = notificationPlugin;
    }

    @GetMapping(value = "/resposta", produces = MediaType.TEXT_PLAIN_VALUE)
    public String respostaParceiro() {
        notificationPlugin.responderProduto();
        return "Resposta enviada ao produto !!";
    }
}
