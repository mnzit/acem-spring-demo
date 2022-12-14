[//]: # " Copyright (c) 2012, 2018 Oracle and/or its affiliates. All rights reserved. "
[//]: # "  "
[//]: # " This program and the accompanying materials are made available under the "
[//]: # " terms of the Eclipse Public License v. 2.0, which is available at "
[//]: # " http://www.eclipse.org/legal/epl-2.0. "
[//]: # "  "
[//]: # " This Source Code may also be made available under the following Secondary "
[//]: # " Licenses when the conditions for such availability set forth in the "
[//]: # " Eclipse Public License v. 2.0 are satisfied: GNU General Public License, "
[//]: # " version 2 with the GNU Classpath Exception, which is available at "
[//]: # " https://www.gnu.org/software/classpath/license.html. "
[//]: # "  "
[//]: # " SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 "

jersey-example-java8-webapp
==========================================================

This example demonstrates how to ...

Contents
--------

The mapping of the URI path space is presented in the following table:

URI path                                   | Resource class            | HTTP methods
------------------------------------------ | ------------------------- | --------------
**_/resource_**                            | JerseyResource            | GET

Sample Response
---------------

```javascript

```

Running the Example
-------------------

Run the example using [Grizzly](http://grizzly.java.net/) container as follows:

>     mvn clean compile exec:java

Run the example using Jetty as follows:

>     mvn clean package jetty:run

-   <http://localhost:8080/base/jersey-resource>
