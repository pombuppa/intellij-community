
/*
 * Copyright 2000-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jetbrains.python.debugger.concurrency.tool.threading.table;

import com.jetbrains.python.debugger.concurrency.PyConcurrencyLogManager;
import com.jetbrains.python.debugger.concurrency.tool.ConcurrencyColorManager;
import com.jetbrains.python.debugger.concurrency.tool.threading.PyThreadingLogManagerImpl;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class ThreadCellRenderer extends DefaultTableCellRenderer {
  private final ConcurrencyColorManager myColorManager;
  private final PyThreadingLogManagerImpl myLogManager;

  public ThreadCellRenderer(ConcurrencyColorManager colorManager, PyConcurrencyLogManager logManager) {
    super();
    myColorManager = colorManager;
    myLogManager = (PyThreadingLogManagerImpl)logManager;
    setBorder(null);
  }

  @Override
  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    c.setBackground(myColorManager.getItemColor(myLogManager.getThreadIdForEventAt(row)));
    return c;
  }
}
