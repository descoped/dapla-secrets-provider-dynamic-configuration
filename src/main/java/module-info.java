import io.descoped.secrets.api.SecretManagerClientInitializer;

module io.descoped.secrets.provider.dynamic.configuration {

    requires io.descoped.service.provider.api;
    requires io.descoped.dynamic.config;

    requires io.descoped.secrets.client.api;

    requires org.slf4j;

    provides SecretManagerClientInitializer with io.descoped.secrets.dynamic.configuration.DynamicSecretConfigurationClientInitializer;

    exports io.descoped.secrets.dynamic.configuration;

}