/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package v2.connection;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Cookie {
    /*
     set-cookie-header = "Set-Cookie:" SP set-cookie-string
     set-cookie-string = cookie-pair *( ";" SP cookie-av )
     cookie-pair       = cookie-name "=" cookie-value
     cookie-name       = token
     cookie-value      = *cookie-octet / ( DQUOTE *cookie-octet DQUOTE )
     cookie-octet      = %x21 / %x23-2B / %x2D-3A / %x3C-5B / %x5D-7E
     ; US-ASCII characters excluding CTLs,
     ; whitespace DQUOTE, comma, semicolon,
     ; and backslash
     token             = <token, defined in [RFC2616], Section 2.2>
     cookie-av         = expires-av / max-age-av / domain-av /
     path-av / secure-av / httponly-av /
     extension-av
     expires-av        = "Expires=" sane-cookie-date
     sane-cookie-date  = <rfc1123-date, defined in [RFC2616], Section 3.3.1>
     max-age-av        = "Max-Age=" non-zero-digit *DIGIT
     ; In practice, both expires-av and max-age-av
     ; are limited to dates representable by the
     ; user agent.
     non-zero-digit    = %x31-39
     ; digits 1 through 9
     domain-av         = "Domain=" domain-value
     domain-value      = <subdomain>
     ; defined in [RFC1034], Section 3.5, as
     ; enhanced by [RFC1123], Section 2.1
     path-av           = "Path=" path-value
     path-value        = <any CHAR except CTLs or ";">
     secure-av         = "Secure"
     httponly-av       = "HttpOnly"
     extension-av      = <any CHAR except CTLs or ";">
     */
    /*
     cookie-header = "Cookie:" OWS cookie-string OWS
     cookie-string = cookie-pair *( ";" SP cookie-pair )
     */
    
    private Date expires;
    private Integer maxAge;
    private String domain;
    private String path;
    private Boolean secure;
    private Boolean httpOnly;
}
