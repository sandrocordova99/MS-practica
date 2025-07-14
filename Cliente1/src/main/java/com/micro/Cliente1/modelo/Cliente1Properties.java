package com.micro.Cliente1.modelo;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cliente1Properties {
    
    private String msg;
    private String buildVersion;
    private Map<String, String> mailDetails;

}
