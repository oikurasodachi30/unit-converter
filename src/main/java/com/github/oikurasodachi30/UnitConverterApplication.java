package com.github.oikurasodachi30;

import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Environment;
import io.dropwizard.core.setup.Bootstrap;
import com.github.oikurasodachi30.resources.UnitConverterResource;

public class UnitConverterApplication extends Application<AppConfiguration> {
    public static void main(String[] args) throws Exception {
        new UnitConverterApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap bootstrap) {
        bootstrap.addBundle(new AssetsBundle("/assets", "/assets", "index.html", "assets"));
    }

    @Override
    public void run(AppConfiguration configuration, Environment environment) {
        environment.jersey().register(new UnitConverterResource());
    }
}
