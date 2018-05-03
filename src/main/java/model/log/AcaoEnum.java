/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.log;

/**
 *
 * @author G0042204
 */
public enum AcaoEnum {

    CONSULTA_CONFIG_PORTA,
    GET_ESTADO_PORTAS_PROXIMAS,
    GET_CONFIABILIDADE_REDE,
    SET_ADM_STATE,
    SET_PROFILE,
    UNSET_ONT_FROM_OLT,
    GET_ONT_FROM_OLT,
    SET_ONT_TO_OLT,
    SET_VLAN_BANDA,
    SET_VLAN_VOIP,
    SET_VLAN_VOD,
    SET_VLAN_MULTICAST,
    RESET_TABELA_REDE,
    RESET_IPTV_STATISTICS,
    FULLTEST_CO,
    FULLTEST_CRM, 
    VALIDADOR_MANOBRA,
    IS_MANAGEABLE,
    CORRETOR_ESTADO_PORTA,
    CORRETOR_VLAN_BANDA,
    CORRETOR_VLANS_VIDEO,
    CORRETOR_VLAN_VOIP,
    CORRETOR_PROFILE;
    
}
