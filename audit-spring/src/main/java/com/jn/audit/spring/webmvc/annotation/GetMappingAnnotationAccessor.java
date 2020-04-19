package com.jn.audit.spring.webmvc.annotation;

import com.jn.audit.spring.webmvc.RequestMappingAccessor;
import com.jn.langx.util.collection.Collects;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class GetMappingAnnotationAccessor implements RequestMappingAccessor<GetMapping> {
    private GetMapping mapping;

    @Override
    public GetMapping getMapping() {
        return mapping;
    }

    @Override
    public void setMapping(GetMapping mapping) {
        this.mapping = mapping;
    }

    @Override
    public String getName() {
        return mapping.name();
    }

    @Override
    public List<String> getValues() {
        return Collects.newArrayList(mapping.value());
    }

    @Override
    public List<String> getPaths() {
        return Collects.newArrayList(mapping.path());
    }

    @Override
    public List<RequestMethod> getMethods() {
        return Collects.newArrayList(RequestMethod.GET);
    }

    @Override
    public List<String> params() {
        return Collects.newArrayList(mapping.params());
    }

    @Override
    public List<String> headers() {
        return Collects.newArrayList(mapping.headers());
    }

    @Override
    public List<String> consumes() {
        return Collects.newArrayList(mapping.consumes());
    }

    @Override
    public List<String> produces() {
        return Collects.newArrayList(mapping.produces());
    }
}
