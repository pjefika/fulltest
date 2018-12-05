/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.manobra.analitcs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author G0042204
 */
public enum ConclusaoManobraEnum {

    PORTA_NOK("Porta com Defeito"), PORTA_OK("Porta Ok"), TROCAR_MODEM("Testar com outro modem");

    private final String nome;

    ConclusaoManobraEnum(String nome) {
        this.nome = nome;
    }

    @JsonValue
    public String getNome() {
        return nome;
    }

    public ConclusaoManobraDTO dto() {
        return new ConclusaoManobraDTO(this);
    }

    private static Map<String, ConclusaoManobraEnum> FORMAT_MAP = Stream
            .of(ConclusaoManobraEnum.values())
            .collect(Collectors.toMap(s -> s.nome, Function.identity()));

    @JsonCreator // This is the factory method and must be static
    public static ConclusaoManobraEnum fromString(String string) {
        return Optional
                .ofNullable(FORMAT_MAP.get(string))
                .orElseThrow(() -> new IllegalArgumentException(string));
    }

}
