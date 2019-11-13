package com.test.demoproperty1;

import java.util.Arrays;

import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties
//@PropertySource("classpath:app.properties")
@Validated
@PropertySource(value={"file:D:\\Training\\Practice\\rest-services\\demo-property-1\\app.properties"})
public class MyProperties {
    @NotEmpty
	String name;
	String version;
	Boolean messagingused;
	Integer[] zip;

	Myapp myapp;
	Mail mail;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Boolean getMessagingused() {
		return messagingused;
	}

	public void setMessagingused(Boolean messagingused) {
		this.messagingused = messagingused;
	}

	public Integer[] getZip() {
		return zip;
	}

	public void setZip(Integer[] zip) {
		this.zip = zip;
	}

	public Myapp getMyapp() {
		return myapp;
	}

	public void setMyapp(Myapp myapp) {
		this.myapp = myapp;
	}

	public Mail getMail() {
		return mail;
	}

	public void setMail(Mail mail) {
		this.mail = mail;
	}

	public static class Myapp {
		String language;
		String build;

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getBuild() {
			return build;
		}

		public void setBuild(String build) {
			this.build = build;
		}

		public String toString() {
			return "Myapp [language=" + language + ", build=" + build + "]";
		}
	}

	public static class Mail {
		String host;
		int port;
		String protocol;

		public String getHost() {
			return host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public int getPort() {
			return port;
		}

		public void setPort(int port) {
			this.port = port;
		}

		public String getProtocol() {
			return protocol;
		}

		public void setProtocol(String protocol) {
			this.protocol = protocol;
		}

		@Override
		public String toString() {
			return "Mail [host=" + host + ", port=" + port + ", protocol=" + protocol + "]";
		}
	}

	@Override
	public String toString() {
		return "MyProperties [name=" + name + ", version=" + version + ", messagingused=" + messagingused + ", zip="
				+ Arrays.toString(zip) + ", myapp=" + myapp + ", mail=" + mail + "]";
	}
}
