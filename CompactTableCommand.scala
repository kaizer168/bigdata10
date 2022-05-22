package org.apache.spark.sql.execution.command

import org.apache.spark.sql.{Row, SparkSession}
import org.apache.spark.sql.catalyst.expressions.{Attribute, AttributeReference}
import org.apache.spark.sql.types.StringType

case class CompactTableCommand() extends LeafRunnableCommand {
  override def run(sparkSession: SparkSession): Seq[Row] = {
//To-do
    Seq.empty[Row]
  }
}
