﻿/* @csharp.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

namespace GridGain.Client.Impl.Portable
{
    using System.IO;

    /**
     * Output writing data to the stream.
     */ 
    class GridClientPortableStreamMarshallerOutput : IGridClientPortableMarshallerOutput 
    {
        /** Underlying stream. */
        private readonly Stream stream;

        /**
         * <summary>Constructor.</summary>
         * <param name="stream">Stream.</param>
         */ 
        public GridClientPortableStreamMarshallerOutput(Stream stream)
        {
            this.stream = stream;
        }

        /** <inheritdoc /> */
        public void Initialize(int val)
        {
            // No-op.
        }

        /** <inheritdoc /> */
        public void WriteByte(byte val)
        {
            stream.WriteByte(val);
        }

        /** <inheritdoc /> */
        public void WriteBytes(byte[] val)
        {
            stream.Write(val, 0, val.Length);
        }

        /** <inheritdoc /> */
        public void Close()
        {
            stream.Flush();
        }
    }
}