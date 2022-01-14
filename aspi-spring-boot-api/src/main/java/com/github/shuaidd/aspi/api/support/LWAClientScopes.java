package com.github.shuaidd.aspi.api.support;


import com.google.gson.annotations.JsonAdapter;

import java.util.Set;

@JsonAdapter(LWAClientScopesSerializerDeserializer.class)
public class LWAClientScopes {

    private final Set<String> scopes;

    public LWAClientScopes(Set<String> scopes) {
        this.scopes = scopes;
    }

    protected void addScope(String scope) {
        scopes.add(scope);

    }

    protected boolean isEmpty() {
        return scopes.isEmpty();
    }

    public Set<String> getScopes() {
        return scopes;
    }
}
