package de.adorsys.psd2.validator.certificate;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import de.adorsys.psd2.validator.certificate.util.CertificateExtractorUtil;
import de.adorsys.psd2.validator.certificate.util.TppCertData;

public class CertificateExtractorUtilTest {

	@Test
	public void testExtractCertData() throws IOException {
		
		String encodedCert = "-----BEGIN CERTIFICATE-----MIIDpTCCAo2gAwIBAgIEVEnCYjANBgkqhkiG9w0BAQsFADCBlDELMAkGA1UEBhMCREUxDzANBgNVBAgMBkhlc3NlbjESMBAGA1UEBwwJRnJhbmtmdXJ0MRUwEwYDVQQKDAxBdXRob3JpdHkgQ0ExCzAJBgNVBAsMAklUMSEwHwYDVQQDDBhBdXRob3JpdHkgQ0EgRG9tYWluIE5hbWUxGTAXBgkqhkiG9w0BCQEWCmNhQHRlc3QuZGUwHhcNMTgwNjE0MDg1MjA4WhcNMTgwNzAxMDkzMjM3WjBnMRMwEQYDVQQDDApkb21haW5OYW1lMQwwCgYDVQQKDANvcmcxCzAJBgNVBAsMAm91MRAwDgYDVQQGEwdHZXJtYW55MQ8wDQYDVQQIDAZCYXllcm4xEjAQBgNVBAcMCU51cmVtYmVyZzCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAJj47Fn42ZJv9UyX902dRS8Fosva1UHcCNUETarrvONHL1Kd2oJ1DTImpqmzcTT0wl4oz/64Zfz46tec3uGSwvdFTtcNoj4orUSsecTH1dRkCLzEy9nUofUnQUaiQzz/H8TjqA1kyskl2gpI5hEJ0cO2Q9M7SIby+JwLkwJT9lT+UVD1Ni8T51gv3H3PEclTNgpJsIidJRPHCTjReUUwZ/N0X78bz1YsX/L4AVtrC+6j0XWtYRjRfZJadg39oAv843wTqaOukdfBHQjl6f64XLvfqrmI/RANZ6Hc++UtAeByQ2jTpLVXQ/aykdzULW27rI8vozNfq99De02DgoI3IL8CAwEAAaMrMCkwJwYDVR0RBCAwHqAIBgMqAwECAQCgCAYDKgMCAgEBoAgGAyoDAwIBATANBgkqhkiG9w0BAQsFAAOCAQEAIie6+/L7AaPnUKS4ogDbRpk+HTz4X8FifEggIsL5xAeYKf0eupbYhkjvxAoVzMZTMBltMgwCFAwRHQLYmOIDkaePIRT5xuU1u4gxI02g8cdQGmtaD0DXGYS9t13CsF5Dz/+IBQll1GA9p1zI2EfqeUJncpPrjJfAg7cXq2k1AUUfcqFqFffZpD9VtteonM9jQ5m5sSjL7vgdZBWffqOJ9yHcrx6/irTLRpRHlTVSnB4FCEJwkYX5lvucKHcBRKGywioA2NizhyHSS48WQcH9Ccse1u+775go7oGsRtsLAI0ffMXe0lxiWB8olGFH5scTPquhVE8rb5fCLHp0f+kG/Q==-----END CERTIFICATE-----";
		
		TppCertData extract = CertificateExtractorUtil.extract(encodedCert);
		
		Assert.assertTrue(extract.getPspRoles().size() == 2);
	}
}
