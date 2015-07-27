package org.example.config;

import org.example.api.UserBean;
import org.example.service.HelloWorldService;

import dagger.Module;
import dagger.Provides;

@Module(injects = { HelloWorldService.class }, library = true)
public class DaggerModule {
	@Provides
	UserBean provideUserBean() {
		return new UserBean();
	}
}
