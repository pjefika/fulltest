/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;
import br.com.caelum.vraptor.view.Results;
import javax.inject.Inject;

/**
 *
 * @author G0034481
 */
public abstract class AbstractController {

    @Inject
    protected Result result;

    @Inject
    protected Validator validator;

    public AbstractController() {
    }

    public void includeSerializer(Object a) {
        result.use(Results.json()).from(a).serialize();
    }

}
