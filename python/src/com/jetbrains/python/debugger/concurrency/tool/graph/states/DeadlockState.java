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
package com.jetbrains.python.debugger.concurrency.tool.graph.states;

import com.jetbrains.python.debugger.concurrency.tool.GraphSettings;

import java.awt.*;

/**
 * Created by user on 5/4/15.
 */
public class DeadlockState extends ThreadState {
  @Override
  public void prepareStroke(Graphics g) {
    Graphics2D g2 = (Graphics2D)g;
    g2.setStroke(new BasicStroke(GraphSettings.STROKE_BASIC));
    g2.setColor(GraphSettings.DEADLOCK_COLOR);
  }
}
