package com.github.dreamhead.moco.parser.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.github.dreamhead.moco.MocoRest;
import com.github.dreamhead.moco.RestSettingBuilder;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class RestGetSetting extends RestSingleSetting {
    @Override
    protected RestSettingBuilder startRestSetting() {
        return MocoRest.get(id());
    }
}