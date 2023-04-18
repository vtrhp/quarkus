package org.acme.rest.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Extension {
    public String id;
    public String name;
    public String shortName;
    public List<String> keywords;
}
