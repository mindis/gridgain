/* @java.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.kernal.portable;

import org.gridgain.grid.portable.*;
import org.gridgain.grid.util.*;
import org.jetbrains.annotations.*;
import sun.misc.*;

import java.util.*;

/**
 * Portable writer implementation based on {@code sun.misc.Unsafe}.
 */
class GridUnsafePortableWriter extends GridPortableWriterAdapter {
    /** */
    private static final Unsafe UNSAFE = GridUnsafe.unsafe();

    /** */
    private static final long BYTE_ARR_OFF = UNSAFE.arrayBaseOffset(byte[].class);

    /** */
    private static final long SHORT_ARR_OFF = UNSAFE.arrayBaseOffset(short[].class);

    /** */
    private static final long INT_ARR_OFF = UNSAFE.arrayBaseOffset(int[].class);

    /** */
    private static final long LONG_ARR_OFF = UNSAFE.arrayBaseOffset(long[].class);

    /** */
    private static final long FLOAT_ARR_OFF = UNSAFE.arrayBaseOffset(float[].class);

    /** */
    private static final long DOUBLE_ARR_OFF = UNSAFE.arrayBaseOffset(double[].class);

    /** */
    private static final long CHAR_ARR_OFF = UNSAFE.arrayBaseOffset(char[].class);

    /** */
    private static final long BOOLEAN_ARR_OFF = UNSAFE.arrayBaseOffset(boolean[].class);

    /** {@inheritDoc} */
    @Override public void writeByte(String fieldName, byte val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeByte(byte val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeShort(String fieldName, short val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeShort(short val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeInt(String fieldName, int val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeInt(int val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeLong(String fieldName, long val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeLong(long val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeFloat(String fieldName, float val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeFloat(float val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeDouble(String fieldName, double val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeDouble(double val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeChar(String fieldName, char val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeChar(char val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeBoolean(String fieldName, boolean val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeBoolean(boolean val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeString(String fieldName, @Nullable String val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeString(@Nullable String val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeUuid(String fieldName, @Nullable UUID uuid) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeUuid(@Nullable UUID uuid) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public <T> void writeObject(String fieldName, @Nullable T obj) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public <T> void writeObject(@Nullable T obj) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeByteArray(String fieldName, @Nullable byte[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeByteArray(@Nullable byte[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeShortArray(String fieldName, @Nullable short[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeShortArray(@Nullable short[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeIntArray(String fieldName, @Nullable int[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeIntArray(@Nullable int[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeLongArray(String fieldName, @Nullable long[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeLongArray(@Nullable long[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeFloatArray(String fieldName, @Nullable float[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeFloatArray(@Nullable float[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeDoubleArray(String fieldName, @Nullable double[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeDoubleArray(@Nullable double[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeCharArray(String fieldName, @Nullable char[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeCharArray(@Nullable char[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeBooleanArray(String fieldName, @Nullable boolean[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeBooleanArray(@Nullable boolean[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeStringArray(String fieldName, @Nullable String[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeStringArray(@Nullable String[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeUuidArray(String fieldName, @Nullable UUID[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeUuidArray(@Nullable UUID[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeObjectArray(String fieldName, @Nullable Object[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public void writeObjectArray(@Nullable Object[] val) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public <T> void writeCollection(String fieldName, @Nullable Collection<T> col)
        throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public <T> void writeCollection(@Nullable Collection<T> col) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public <K, V> void writeMap(String fieldName, @Nullable Map<K, V> map) throws GridPortableException {
        // TODO: implement.
    }

    /** {@inheritDoc} */
    @Override public <K, V> void writeMap(@Nullable Map<K, V> map) throws GridPortableException {
        // TODO: implement.
    }
}