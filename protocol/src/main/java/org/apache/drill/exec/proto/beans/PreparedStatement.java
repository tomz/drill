/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from protobuf

package org.apache.drill.exec.proto.beans;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;

public final class PreparedStatement implements Externalizable, Message<PreparedStatement>, Schema<PreparedStatement>
{

    public static Schema<PreparedStatement> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static PreparedStatement getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final PreparedStatement DEFAULT_INSTANCE = new PreparedStatement();

    
    private List<ResultColumnMetadata> columns;
    private PreparedStatementHandle serverHandle;

    public PreparedStatement()
    {
        
    }

    // getters and setters

    // columns

    public List<ResultColumnMetadata> getColumnsList()
    {
        return columns;
    }

    public PreparedStatement setColumnsList(List<ResultColumnMetadata> columns)
    {
        this.columns = columns;
        return this;
    }

    // serverHandle

    public PreparedStatementHandle getServerHandle()
    {
        return serverHandle;
    }

    public PreparedStatement setServerHandle(PreparedStatementHandle serverHandle)
    {
        this.serverHandle = serverHandle;
        return this;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<PreparedStatement> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public PreparedStatement newMessage()
    {
        return new PreparedStatement();
    }

    public Class<PreparedStatement> typeClass()
    {
        return PreparedStatement.class;
    }

    public String messageName()
    {
        return PreparedStatement.class.getSimpleName();
    }

    public String messageFullName()
    {
        return PreparedStatement.class.getName();
    }

    public boolean isInitialized(PreparedStatement message)
    {
        return true;
    }

    public void mergeFrom(Input input, PreparedStatement message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    if(message.columns == null)
                        message.columns = new ArrayList<ResultColumnMetadata>();
                    message.columns.add(input.mergeObject(null, ResultColumnMetadata.getSchema()));
                    break;

                case 2:
                    message.serverHandle = input.mergeObject(message.serverHandle, PreparedStatementHandle.getSchema());
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, PreparedStatement message) throws IOException
    {
        if(message.columns != null)
        {
            for(ResultColumnMetadata columns : message.columns)
            {
                if(columns != null)
                    output.writeObject(1, columns, ResultColumnMetadata.getSchema(), true);
            }
        }


        if(message.serverHandle != null)
             output.writeObject(2, message.serverHandle, PreparedStatementHandle.getSchema(), false);

    }

    public String getFieldName(int number)
    {
        switch(number)
        {
            case 1: return "columns";
            case 2: return "serverHandle";
            default: return null;
        }
    }

    public int getFieldNumber(String name)
    {
        final Integer number = __fieldMap.get(name);
        return number == null ? 0 : number.intValue();
    }

    private static final java.util.HashMap<String,Integer> __fieldMap = new java.util.HashMap<String,Integer>();
    static
    {
        __fieldMap.put("columns", 1);
        __fieldMap.put("serverHandle", 2);
    }
    
}
