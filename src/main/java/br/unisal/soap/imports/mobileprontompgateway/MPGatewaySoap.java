
package br.unisal.soap.imports.mobileprontompgateway;

import java.math.BigDecimal;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MPGatewaySoap", targetNamespace = "MobileProntoMPGateway")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MPGatewaySoap {


    /**
     * <br>Calculo do Tamanho de uma Mensagem em UTF-8 ou UTF_16 (hexa) - v_3_00.<br><br>ATENÇÃO: Recomendamos utilizar a documentação do site: http://www.mobipronto.com/pt-br/SMS-MT-API/documentacao-sms-mt-api-web-service-v3-00<br>
     * 
     * @param credencial
     * @param message
     * @param token
     * @return
     *     returns int
     */
    @WebMethod(operationName = "MPG_Calculate_Message_Length_UTF8_or_UTF16", action = "MobileProntoMPGateway/MPG_Calculate_Message_Length_UTF8_or_UTF16")
    @WebResult(name = "MPG_Calculate_Message_Length_UTF8_or_UTF16Result", targetNamespace = "MobileProntoMPGateway")
    @RequestWrapper(localName = "MPG_Calculate_Message_Length_UTF8_or_UTF16", targetNamespace = "MobileProntoMPGateway", className = "mobileprontompgateway.MPGCalculateMessageLengthUTF8OrUTF16")
    @ResponseWrapper(localName = "MPG_Calculate_Message_Length_UTF8_or_UTF16Response", targetNamespace = "MobileProntoMPGateway", className = "mobileprontompgateway.MPGCalculateMessageLengthUTF8OrUTF16Response")
    public int mpgCalculateMessageLengthUTF8OrUTF16(
        @WebParam(name = "Credencial", targetNamespace = "MobileProntoMPGateway")
        String credencial,
        @WebParam(name = "Token", targetNamespace = "MobileProntoMPGateway")
        String token,
        @WebParam(name = "Message", targetNamespace = "MobileProntoMPGateway")
        String message);

    /**
     * <br><br>ATENÇÃO: Este método será descontinuado na próxima versão.<br><br>Parâmetros da MPG_SendSimple_SMS: Versão: v_3_00<br> ----------------------------------------------------------------------------------------------------------------------------------<br> Credencial - Obrigatório - Chave de 40 posições para acesso ao Mobile Pronto Gateway. Esta chave é única<br> Token      - Obrigatório - 06 posições para acesso ao Mobile Pronto Gateway.<br> Mobile     - Obrigatório - Celular que receberá o SMS. Formato mundial: +99(999)99999999, sendo pais,ddd e mobile<br> Message    - Obrigatório - Mensagem que será enviada ao mobile. Tamanho máximo por país.<br><br>Observação: O Aux_User será sempre igual a MPG_SendSimple_SMS e a Mensagem será enviada sem o Nome do Projeto na frente<br><br>Tipos de Retorno:<br> ----------------------------------------------------------------------------------------------------------------------------------<br> 000 - Mensagem enviada com Sucesso/Message sent successfully.<br> ----------------------------------------------------------------------------------------------------------------------------------<br> 001 - Credencial Inválida/Invalid Credential<br> 005 - Mobile fora do formato-Formato +999(9999)99999999/Invalid phone number - non-standard<br> 007 - Flag Send_Project tem que ser S,s or Y,y or N,n/Flag Send_Project must be S,s or Y,y or N,n<br> 008 - Mensagem ou Nome_Projeto+Msg maior que máximo no Pais/Message or Project+Msg higher maximun in Country<br> 009 - Sem crédito para envio de SMS. Favor repor/Account without funds. Please purchase more credits<br> 010 - Gateway Bloqueado/Gateway locked for use<br> 012 - Mobile no formato padrão, mas incorreto/Invalid mobile<br> 013 - Mensagem Vazia ou Corpo Inválido/Message Body Blank or Invalid<br> 015 - Pais sem operação/Country without operation<br> 016 - Mobile com tamanho do código de área inválido/Size of area code invalid<br> 017 - Operadora não autorizada para esta Credencial/Operator not allowed for this Credential<br> 018 - Mobile está na Lista Negra/Mobile is in the Black List<br>-----------------------------------------------------------------------------------------------------------------------------------<br><br>-----------------------------------------------------------------------------------------------------------------------------------<br> De 800 a 899 - Falha no MPGateway.Contate Mobile Pronto/Failure MPGateway.Call MobilePronto<br> 900 - Erro de autenticação ou Limite de Segurança excedido/Authentication Error or Security Limitation<br> De 901 a 999 - Erro no acesso as operadoras.Contate Equipe MobilePronto/Contact customer center<br>-----------------------------------------------------------------------------------------------------------------------------------<br>
     * 
     * @param credencial
     * @param mobile
     * @param message
     * @param token
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "MPG_SendSimple_SMS", action = "MobileProntoMPGateway/MPG_SendSimple_SMS")
    @WebResult(name = "MPG_SendSimple_SMSResult", targetNamespace = "MobileProntoMPGateway")
    @RequestWrapper(localName = "MPG_SendSimple_SMS", targetNamespace = "MobileProntoMPGateway", className = "mobileprontompgateway.MPGSendSimpleSMS")
    @ResponseWrapper(localName = "MPG_SendSimple_SMSResponse", targetNamespace = "MobileProntoMPGateway", className = "mobileprontompgateway.MPGSendSimpleSMSResponse")
    public String mpgSendSimpleSMS(
        @WebParam(name = "Credencial", targetNamespace = "MobileProntoMPGateway")
        String credencial,
        @WebParam(name = "Token", targetNamespace = "MobileProntoMPGateway")
        String token,
        @WebParam(name = "Mobile", targetNamespace = "MobileProntoMPGateway")
        String mobile,
        @WebParam(name = "Message", targetNamespace = "MobileProntoMPGateway")
        String message);

    /**
     * <br><br>ATENÇÃO: Este método será descontinuado na próxima versão.<br><br>Envio de SMS Síncrono.<br><br>Parâmetros da MPG_SendandFollowUp_SMS: Versão: v_3_00<br> ----------------------------------------------------------------------------------------------------------------------------------<br> Credencial     - Obrigatório - 40 posições para acesso ao Mobile Pronto Gateway.<br> Token          - Obrigatório - 06 posições para acesso ao Mobile Pronto Gateway.<br> Principal_User - Obrigatório - Código do Usuário Principal para autenticar no Gateway. Normalmente o CNPJ ou CPF. Pode se Vazio.<br> Aux_User       - Obrigatório - Código do Usuário Auxiliar/Qualificar da Mensagem. Máx.=20 posições. Se > 20 será truncado.<br> Mobile         - Obrigatório - Celular que receberá o SMS. Formato mundial: +99(999)99999999, sendo pais,ddd e mobile<br> Send_Project   - Obrigatório - Se (S)im a sigla da mensagem vem no início.<br>                                Se (N)ão não vem. Tamanho máximo=9 (XXXXXXXX:).<br>                                Exemplo: MPG:<mensagem><br> Message        - Obrigatório - Mensagem que será enviada ao mobile. Tamanho máximo de 160 posições.<br><br>Tipos de Retorno: <br>Em caso de Sucesso o retorno é: XXX:IDMPG, sendo XXX sempre igual a 000Em caso de Erro o retorno pode ser: XXX ou XXX:IDERR, sendo XXX o código de erro ----------------------------------------------------------------------------------------------------------------------------------<br> 000 - Mensagem enviada com Sucesso/Message sent successfully.<br> ----------------------------------------------------------------------------------------------------------------------------------<br> 001 - Credencial Inválida/Invalid Credencial<br> 005 - Mobile fora do formato-Formato +999(9999)99999999/Invalid phone number - non-standard<br> 007 - Flag Send_Project tem que ser S,s or Y,y or N,n/Flag Send_Project must be S,s or Y,y or N,n<br> 008 - Mensagem ou Nome_Projeto+Msg maior que máximo no Pais/Message or Project+Msg higher maximun in Country<br> 009 - Sem crédito para envio de SMS. Favor repor/Account without funds. Please purchase more credits<br> 010 - Gateway Bloqueado/Gateway locked for use<br> 012 - Mobile no formato padrão, mas incorreto/Invalid mobile<br> 013 - Mensagem Vazia ou Corpo Inválido/Message Body Blank or Invalid<br> 015 - Pais sem operação/Country without operation<br> 016 - Mobile com tamanho do código de área inválido/Size of area code invalid<br> 017 - Operadora não autorizada para esta Credencial/Operator not allowed for this Credential<br> 018 - Mobile está na Lista Negra/Mobile is in the Black List<br> 019 - Token Inválido/Invalid Token<br>-----------------------------------------------------------------------------------------------------------------------------------<br> De 800 a 899 - Falha no MPGateway.Contate Mobile Pronto/Failure MPGateway.Call MobilePronto<br> 900 - Erro de autenticação ou Limite de Segurança excedido/Authentication Error or Security Limitation<br> De 901 a 999 - Erro no acesso as operadoras.Contate Equipe MobilePronto/Contact customer center<br>-----------------------------------------------------------------------------------------------------------------------------------<br>
     * 
     * @param credencial
     * @param mobile
     * @param auxUser
     * @param message
     * @param sendProject
     * @param principalUser
     * @param token
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "MPG_SendandFollowUp_SMS", action = "MobileProntoMPGateway/MPG_SendandFollowUp_SMS")
    @WebResult(name = "MPG_SendandFollowUp_SMSResult", targetNamespace = "MobileProntoMPGateway")
    @RequestWrapper(localName = "MPG_SendandFollowUp_SMS", targetNamespace = "MobileProntoMPGateway", className = "mobileprontompgateway.MPGSendandFollowUpSMS")
    @ResponseWrapper(localName = "MPG_SendandFollowUp_SMSResponse", targetNamespace = "MobileProntoMPGateway", className = "mobileprontompgateway.MPGSendandFollowUpSMSResponse")
    public String mpgSendandFollowUpSMS(
        @WebParam(name = "Credencial", targetNamespace = "MobileProntoMPGateway")
        String credencial,
        @WebParam(name = "Token", targetNamespace = "MobileProntoMPGateway")
        String token,
        @WebParam(name = "Principal_User", targetNamespace = "MobileProntoMPGateway")
        String principalUser,
        @WebParam(name = "Aux_User", targetNamespace = "MobileProntoMPGateway")
        String auxUser,
        @WebParam(name = "Mobile", targetNamespace = "MobileProntoMPGateway")
        String mobile,
        @WebParam(name = "Send_Project", targetNamespace = "MobileProntoMPGateway")
        String sendProject,
        @WebParam(name = "Message", targetNamespace = "MobileProntoMPGateway")
        String message);

    /**
     * <br><br>ATENÇÃO: Este método será descontinuado na próxima versão.<br><br>Parâmetros da MPG_Send_SMS: Versão: v_3_00<br> ----------------------------------------------------------------------------------------------------------------------------------<br> Credencial     - Obrigatório - 40 posições para acesso ao Mobile Pronto Gateway.<br> Token          - Obrigatório - 06 posições para acesso ao Mobile Pronto Gateway.<br> Principal_User - Obrigatório - Código do Usuário Principal para autenticar no Gateway. Normalmente o CNPJ ou CPF. Pode ser Vazio.<br> Aux_User       - Obrigatório - Código do Usuário Auxiliar/Qualificar da Mensagem. Máx.=20 posições. Se > 20 será truncado.<br> Mobile         - Obrigatório - Celular que receberá o SMS. Formato mundial: +99(999)99999999, sendo pais,ddd e mobile<br> Send_Project   - Obrigatório - Se (S)im a sigla da mensagem vem no início.<br>                                Se (N)ão não vem. Tamanho máximo=9 (XXXXXXXX:).<br>                                Exemplo: MPG:<mensagem><br> Message        - Obrigatório - Mensagem que será enviada ao mobile. Tamanho máximo de 160 posições.<br><br>Tipos de Retorno:<br> ----------------------------------------------------------------------------------------------------------------------------------<br> 000 - Mensagem enviada com Sucesso/Message sent successfully.<br> ----------------------------------------------------------------------------------------------------------------------------------<br> 001 - Credencial Inválida/Invalid Credencial.<br> 005 - Mobile fora do formato-Formato +999(9999)99999999/Invalid phone number - non-standard<br> 007 - Flag Send_Project tem que ser S,s or Y,y or N,n/Flag Send_Project must be S,s or Y,y or N,n<br> 008 - Mensagem ou Nome_Projeto+Msg maior que máximo no Pais/Message or Project+Msg higher maximun in Country<br> 009 - Sem crédito para envio de SMS. Favor repor/Account without funds. Please purchase more credits<br> 010 - Gateway Bloqueado/Gateway locked for use<br> 012 - Mobile no formato padrão, mas incorreto/Invalid mobile<br> 013 - Mensagem Vazia ou Corpo Inválido/Message Body Blank or Invalid<br> 015 - Pais sem operação/Country without operation<br> 016 - Mobile com tamanho do código de área inválido/Size of area code invalid<br> 017 - Operadora não autorizada para esta Credencial/Operator not allowed for this Credential<br> 018 - Mobile está na Lista Negra/Mobile is in the Black List<br> 019 - Token Inválido/Invalid Token<br>-----------------------------------------------------------------------------------------------------------------------------------<br> De 800 a 899 - Falha no MPGateway.Contate Mobile Pronto/Failure MPGateway.Call MobilePronto<br> 900 - Erro de autenticação ou Limite de Segurança excedido/Authentication Error or Security Limitation<br> De 901 a 999 - Erro no acesso as operadoras.Contate Equipe MobilePronto/Contact customer center<br>-----------------------------------------------------------------------------------------------------------------------------------<br>
     * 
     * @param credencial
     * @param mobile
     * @param auxUser
     * @param message
     * @param sendProject
     * @param principalUser
     * @param token
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "MPG_Send_SMS", action = "MobileProntoMPGateway/MPG_Send_SMS")
    @WebResult(name = "MPG_Send_SMSResult", targetNamespace = "MobileProntoMPGateway")
    @RequestWrapper(localName = "MPG_Send_SMS", targetNamespace = "MobileProntoMPGateway", className = "mobileprontompgateway.MPGSendSMS")
    @ResponseWrapper(localName = "MPG_Send_SMSResponse", targetNamespace = "MobileProntoMPGateway", className = "mobileprontompgateway.MPGSendSMSResponse")
    public String mpgSendSMS(
        @WebParam(name = "Credencial", targetNamespace = "MobileProntoMPGateway")
        String credencial,
        @WebParam(name = "Token", targetNamespace = "MobileProntoMPGateway")
        String token,
        @WebParam(name = "Principal_User", targetNamespace = "MobileProntoMPGateway")
        String principalUser,
        @WebParam(name = "Aux_User", targetNamespace = "MobileProntoMPGateway")
        String auxUser,
        @WebParam(name = "Mobile", targetNamespace = "MobileProntoMPGateway")
        String mobile,
        @WebParam(name = "Send_Project", targetNamespace = "MobileProntoMPGateway")
        String sendProject,
        @WebParam(name = "Message", targetNamespace = "MobileProntoMPGateway")
        String message);

    /**
     * <br>Obtendo relação em XML de SMS enviados - v_3_00.<br><br>ATENÇÃO: Recomendamos utilizar a documentação do site: http://www.mobipronto.com/pt-br/SMS-MT-API/documentacao-sms-mt-api-web-service-v3-00<br>
     * 
     * @param credencial
     * @param endDate
     * @param mobile
     * @param auxUser
     * @param mpgQuery01Result
     * @param startDate
     * @param token
     * @param statusCode
     * @param status
     */
    @WebMethod(operationName = "MPG_Query01", action = "MobileProntoMPGateway/MPG_Query01")
    @RequestWrapper(localName = "MPG_Query01", targetNamespace = "MobileProntoMPGateway", className = "mobileprontompgateway.MPGQuery01")
    @ResponseWrapper(localName = "MPG_Query01Response", targetNamespace = "MobileProntoMPGateway", className = "mobileprontompgateway.MPGQuery01Response")
    public void mpgQuery01(
        @WebParam(name = "Credencial", targetNamespace = "MobileProntoMPGateway")
        String credencial,
        @WebParam(name = "Token", targetNamespace = "MobileProntoMPGateway")
        String token,
        @WebParam(name = "Start_Date", targetNamespace = "MobileProntoMPGateway")
        String startDate,
        @WebParam(name = "End_Date", targetNamespace = "MobileProntoMPGateway")
        String endDate,
        @WebParam(name = "Aux_User", targetNamespace = "MobileProntoMPGateway")
        String auxUser,
        @WebParam(name = "Mobile", targetNamespace = "MobileProntoMPGateway")
        String mobile,
        @WebParam(name = "Status_Code", targetNamespace = "MobileProntoMPGateway")
        int statusCode,
        @WebParam(name = "Status", targetNamespace = "MobileProntoMPGateway", mode = WebParam.Mode.INOUT)
        Holder<String> status,
        @WebParam(name = "MPG_Query01Result", targetNamespace = "MobileProntoMPGateway", mode = WebParam.Mode.OUT)
        Holder<String> mpgQuery01Result);

    /**
     * <br>Obtendo créditos da conta - v_3_00.<br><br>ATENÇÃO: Recomendamos utilizar a documentação do site: http://www.mobipronto.com/pt-br/SMS-MT-API/documentacao-sms-mt-api-web-service-v3-00<br>
     * 
     * @param mpgCreditsResult
     * @param credencial
     * @param vStStatus
     * @param token
     */
    @WebMethod(operationName = "MPG_Credits", action = "MobileProntoMPGateway/MPG_Credits")
    @RequestWrapper(localName = "MPG_Credits", targetNamespace = "MobileProntoMPGateway", className = "mobileprontompgateway.MPGCredits")
    @ResponseWrapper(localName = "MPG_CreditsResponse", targetNamespace = "MobileProntoMPGateway", className = "mobileprontompgateway.MPGCreditsResponse")
    public void mpgCredits(
        @WebParam(name = "Credencial", targetNamespace = "MobileProntoMPGateway")
        String credencial,
        @WebParam(name = "Token", targetNamespace = "MobileProntoMPGateway")
        String token,
        @WebParam(name = "v_st_Status", targetNamespace = "MobileProntoMPGateway", mode = WebParam.Mode.INOUT)
        Holder<String> vStStatus,
        @WebParam(name = "MPG_CreditsResult", targetNamespace = "MobileProntoMPGateway", mode = WebParam.Mode.OUT)
        Holder<BigDecimal> mpgCreditsResult);

    /**
     * <br>Enviando SMS (de 161 a 1000 caracteres) - v_3_00.<br><br>ATENÇÃO: Recomendamos utilizar a documentação do site: http://www.mobipronto.com/pt-br/SMS-MT-API/documentacao-sms-mt-api-web-service-v3-00<br>
     * 
     * @param credencial
     * @param mobile
     * @param auxUser
     * @param message
     * @param principalUser
     * @param token
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "MPG_Send_LMS", action = "MobileProntoMPGateway/MPG_Send_LMS")
    @WebResult(name = "MPG_Send_LMSResult", targetNamespace = "MobileProntoMPGateway")
    @RequestWrapper(localName = "MPG_Send_LMS", targetNamespace = "MobileProntoMPGateway", className = "mobileprontompgateway.MPGSendLMS")
    @ResponseWrapper(localName = "MPG_Send_LMSResponse", targetNamespace = "MobileProntoMPGateway", className = "mobileprontompgateway.MPGSendLMSResponse")
    public String mpgSendLMS(
        @WebParam(name = "Credencial", targetNamespace = "MobileProntoMPGateway")
        String credencial,
        @WebParam(name = "Token", targetNamespace = "MobileProntoMPGateway")
        String token,
        @WebParam(name = "Principal_User", targetNamespace = "MobileProntoMPGateway")
        String principalUser,
        @WebParam(name = "Aux_User", targetNamespace = "MobileProntoMPGateway")
        String auxUser,
        @WebParam(name = "Mobile", targetNamespace = "MobileProntoMPGateway")
        String mobile,
        @WebParam(name = "Message", targetNamespace = "MobileProntoMPGateway")
        String message);

    /**
     * <br><br>ATENÇÃO: Este método será descontinuado na próxima versão.<br><br>Parâmetros da MPG_Send_Long_SMS: Versão: v_3_00<br> ----------------------------------------------------------------------------------------------------------------------------------<br> Credencial     - Obrigatório - 40 posições para acesso ao Mobile Pronto Gateway.<br> Token          - Obrigatório - 06 posições para acesso ao Mobile Pronto Gateway.<br> Principal_User - Obrigatório - Código do Usuário Principal para autenticar no Gateway. Normalmente o CNPJ ou CPF. Pode ser Vazio.<br> Aux_User       - Obrigatório - Código do Usuário Auxiliar/Qualificar da Mensagem. Máx.=20 posições. Se > 20 será truncado.<br> Mobile         - Obrigatório - Celular que receberá o SMS. Formato mundial: +99(999)99999999, sendo pais,ddd e mobile<br> Message        - Obrigatório - Mensagem que será enviada ao mobile. Tamanho máximo de 15.300 posições.<br> Iremos enviar várias mensagens de 160 caracteres em SMS separados.<br><br>Tipos de Retorno:<br> ----------------------------------------------------------------------------------------------------------------------------------<br> 000:000:000: - Mensagem Longa enviada com Sucesso.<br> ----------------------------------------------------------------------------------------------------------------------------------<br> 001 - Credencial Inválida/Invalid Credencial.<br> 005 - Mobile fora do formato-Formato +999(9999)99999999.Valido somente no Brasil.<br> 008 - Mensagem maior que máximo (15.300).<br> 009 - Sem crédito para envio de SMS. Favor repor.<br> 010 - Gateway Bloqueado.<br> 012 - Mobile no formato padrão, mas incorreto.<br> 013 - Mensagem Vazia ou Corpo Inválido.<br> 015 - Pais sem operação.País não aceita LMS.<br> 016 - Mobile com tamanho do código de área inválido.<br> 017 - Operadora não autorizada para esta Credencial.<br> 018 - Mobile está na Lista Negra.<br> 019 - Token Inválido.<br>------------------------------------------------------------------------------------------------------------------<br> De 800 a 899 - Falha no MPGateway.Contate Mobile Pronto/Failure MPGateway.Call MobilePronto<br> 900 - Erro de autenticação ou Limite de Segurança excedido/Authentication Error or Security Limitation<br> De 901 a 999 - Erro no acesso as operadoras.Contate Equipe MobilePronto/Contact customer center<br>------------------------------------------------------------------------------------------------------------------<br>
     * 
     * @param credencial
     * @param mobile
     * @param auxUser
     * @param message
     * @param principalUser
     * @param token
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "MPG_Send_Long_SMS", action = "MobileProntoMPGateway/MPG_Send_Long_SMS")
    @WebResult(name = "MPG_Send_Long_SMSResult", targetNamespace = "MobileProntoMPGateway")
    @RequestWrapper(localName = "MPG_Send_Long_SMS", targetNamespace = "MobileProntoMPGateway", className = "mobileprontompgateway.MPGSendLongSMS")
    @ResponseWrapper(localName = "MPG_Send_Long_SMSResponse", targetNamespace = "MobileProntoMPGateway", className = "mobileprontompgateway.MPGSendLongSMSResponse")
    public String mpgSendLongSMS(
        @WebParam(name = "Credencial", targetNamespace = "MobileProntoMPGateway")
        String credencial,
        @WebParam(name = "Token", targetNamespace = "MobileProntoMPGateway")
        String token,
        @WebParam(name = "Principal_User", targetNamespace = "MobileProntoMPGateway")
        String principalUser,
        @WebParam(name = "Aux_User", targetNamespace = "MobileProntoMPGateway")
        String auxUser,
        @WebParam(name = "Mobile", targetNamespace = "MobileProntoMPGateway")
        String mobile,
        @WebParam(name = "Message", targetNamespace = "MobileProntoMPGateway")
        String message);

}
