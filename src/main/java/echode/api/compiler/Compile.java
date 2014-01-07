/*
 * Echode
 *     Copyright (C) 2014  Echode Team
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package echode.api.compiler;

import echode.api.Program;

import java.io.PrintStream;

/**
 * Created by Marks on 14.3.1.
 */
public class Compile extends Program {

    @Override
    public String help() {
        return null;
    }

    @Override
    public void run(PrintStream o, String[] args) {
        if(args.length < 1) {
            o.println("Usage: compile {name of program to compile}");
        } else {

        }
    }

    @Override
    public void init() {

    }

    @Override
    public String getName() {
        return "compile";
    }
}
