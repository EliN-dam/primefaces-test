package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {
    
    private String string;

    @PostConstruct  
    public void init() {
        string = "Welcome to PrimeFaces!!!";
    }

    public String forward() {
        return "page2";
    }

    public String back() {
        return "index";
    }
}
