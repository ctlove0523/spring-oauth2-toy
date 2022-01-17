package io.github.ctlove0523.oauth2.client;


import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;

@Configuration
@EnableOAuth2Sso
public class OAuthClientConfig {
    /**
     * 定义了OAuth2RestTemplate，网上一些比较老的资料给出的是手动读取配置文件来实现，最新版本已经可以自动注入OAuth2ProtectedResourceDetails
     *
     * @param details             受保护资源详情
     * @param oAuth2ClientContext 客户端上下文
     * @return {@link OAuth2RestTemplate}
     */
    @Bean
    public OAuth2RestTemplate oauth2RestTemplate(OAuth2ProtectedResourceDetails details,
                                                 OAuth2ClientContext oAuth2ClientContext) {
        return new OAuth2RestTemplate(details, oAuth2ClientContext);
    }
}
