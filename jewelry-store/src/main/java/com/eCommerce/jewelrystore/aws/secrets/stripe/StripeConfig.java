package com.eCommerce.jewelrystore.aws.secrets.stripe;

import com.eCommerce.jewelrystore.aws.secrets.AWSSecrets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StripeConfig {

    //To-do:: get these values from secret vaults
    protected final String stripeSecretName = "dev/api/keys";
    protected final String stripeApiKey = "dev-stripe-public-key";

    private AWSSecrets awsSecrets;

    public StripeConfig(AWSSecrets awsSecrets) {
        this.awsSecrets = awsSecrets;
    }

    @Bean
    public StripeSecret stripeSecret(){
        StripeSecret stripeSecret = new StripeSecret();
        String secret = awsSecrets.getSecret(stripeSecretName);
        String apiSecretValue = awsSecrets.getApiSecretValue(secret,stripeApiKey);
        stripeSecret.setStripePublicKey(apiSecretValue);
        return stripeSecret;
    }
}
