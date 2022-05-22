package org.apache.spark.sql.execution.command

import org.apache.spark.sql.{Row, SparkSession}
import org.apache.spark.sql.catalyst.expressions.{Attribute, AttributeReference}
import org.apache.spark.sql.types.StringType
import org.apache.spark.sql.functions.rand

case class CompactTableCommand(
  table: tableIdentifier,
  partition: Option[partitionSpec]) extends LeafRunnableCommand {
  override def run(sparkSession: SparkSession): Seq[Row] = {
//To-do
    val catalog = sparkSession.sessionState.catalog
    val targetTable = catalog.getTableMetadata(table)
  if (partition.isDefined) {
    df.repartition(fileNum, $"key", rand)
      .write
      .option("header", "true")
      .partitionBy("key")
      .csv("/path/partitioned")
  }
//To-do
    Seq.empty[Row]
  }
}
