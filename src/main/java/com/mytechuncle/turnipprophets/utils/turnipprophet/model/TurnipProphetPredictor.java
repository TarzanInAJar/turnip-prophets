package com.mytechuncle.turnipprophets.utils.turnipprophet.model;

import com.mytechuncle.turnipprophets.utils.PredictionRequest;
import com.mytechuncle.turnipprophets.utils.PredictionResult;
import com.mytechuncle.turnipprophets.utils.Predictor;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;
import org.springframework.util.StreamUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.Files.*;
import static java.util.Arrays.asList;

public class TurnipProphetPredictor implements Predictor {


    @Override
    public PredictionResult predict(PredictionRequest request) {
        try {
            getResult(request);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private TurnipProphetPredictionResult getResult(PredictionRequest request) throws IOException {
        Context context = Context.create();
        Value jsBindings = context.getBindings("js");
        String all = Files.readString(Paths.get("modules/ac-nh-turnip-prices/js/predictions.js"), StandardCharsets.UTF_8);
        context.eval("js", all);

        Value nan = context.eval("js", "NaN");
        jsBindings.putMember("data", getJsArray(context, 97,97,86,82,nan,nan,nan,nan,nan,nan,nan,nan,nan,nan));
        jsBindings.putMember("first_buy", false); //TODO
        jsBindings.putMember("previous_pattern", 0);
        context.eval("js", "let predictor = new Predictor(data, first_buy, previous_pattern)");
        Value predictor = jsBindings.getMember("predictor");
        Value possibilities = context.eval("js", "predictor.analyze_possibilities()");
        //possibilities.as(TurnipProphetPrediction[].class);
        context.close();

        return null;
    }

    private Value getJsArray(Context context, Object ... vals) {
        Value array = context.eval("js", "new Array()");
        for (int i = 0; i < vals.length; i++) {
            array.setArrayElement(i, vals[i]);
        }
        return array;
    }
}
