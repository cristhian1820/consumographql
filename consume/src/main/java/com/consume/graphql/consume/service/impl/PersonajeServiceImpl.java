package com.consume.graphql.consume.service.impl;

import com.consume.graphql.consume.model.dto.personaje.InputPersonaje;
import com.consume.graphql.consume.service.IPersonajeService;
import com.consume.graphql.consume.utils.RandomString;
import com.consume.graphql.consume.utils.RequestGraphql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonajeServiceImpl implements IPersonajeService {

    private final RequestGraphql requestGraphql;

    @Autowired
    public PersonajeServiceImpl(RequestGraphql requestMutation) {
        this.requestGraphql = requestMutation;
    }

    @Override
    public ResponseEntity<String> obtenerPersonaje() {

        String query = /*"{\n" +
                "  allPersonajes{\n" +
                "    id\n" +
                "    nombre\n" +
                "    apodo\n" +
                "    ocupacion\n" +
                "    fecha\n" +
                "    series{\n" +
                "      id\n" +
                "      nombre\n" +
                "    }\n" +
                "  }\n" +
                "}";*/

                //Query para voika por json
                "{\"query\": \"{" +
                        " user(celular:\\\"+573168333879\\\"){" +
                        " id" +
                        " email " +
                        " }" +
                        " }" +
                        "\"}";

        System.out.println(query);


        return requestGraphql.send(query);
    }

    @Override
    public ResponseEntity<String> registrar(InputPersonaje input) {

        /*String sbTransacionId = new RandomString().getAlphaNumericString(20);

        System.out.println(">>" + sbTransacionId);*/

        String query = String.format("mutation{\n" +
                "  registrarPersonaje(%s){    \n" +
                "    id\n" +
                "    nombre\n" +
                "    apodo\n" +
                "    ocupacion\n" +
                "    fecha\n" +
                "  }\n" +
                "}\n",input.inputQuery());

//mutation para voike por json
               /* "{\"query\":"
                        + "\"mutation{ "
                        + "   createTransaction(transaction:{"
                        + "                                  user:\\\"665b7135-bffd-492a-9c38-42ebbd00c067\\\", "
                        + "                                  buyed:2, "
                        + "                                  billing:\\\"3333333\\\", "
                        + "                                  currency:\\\"COL\\\", "
                        + "                                  amount:2.5, "
                        + "                                  status:\\\"A\\\", "
                        + "                                  transaction_id:\\\"" + sbTransacionId + "\\\""
                        + "                                 }"
                        + "                    ){"
                        + "                      id"
                        + "                      user"
                        + "                     }"
                        + "          }\"" +
                        "}";*/
                System.out.println(query);
        return requestGraphql.send(query);
    }
}
