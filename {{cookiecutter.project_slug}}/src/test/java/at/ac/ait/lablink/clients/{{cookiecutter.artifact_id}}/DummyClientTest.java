//
// Copyright (c) AIT Austrian Institute of Technology GmbH.
// Distributed under the terms of the Modified BSD License.
//

package at.ac.ait.lablink.clients.{{cookiecutter.artifact_id}};

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for class DummyClient.
 */
public class DummyClientTest {

  @Test
  public void dummy_test() {
    DummyClient c = new DummyClient();
    assertEquals(true, c != null);
  }
}
